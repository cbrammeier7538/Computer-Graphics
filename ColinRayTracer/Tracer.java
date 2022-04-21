public class Tracer 
{
    public void trace(int x, int y)
    {
        Ray ray = new Ray(new Point(1.0*(x-Driver.world.viewPlane.width/2+.5), 1.0*(y-Driver.world.viewPlane.height/2+.5), 100), new Vector(0.0, 0.0, -1.0));
        double min = Double.MAX_VALUE;
        Color color = Driver.world.Background;

        for(int i = 0; i < Driver.world.objects.size(); i++)
        {
            double tem = Driver.world.objects.get(i).hit(ray);
            if(tem != 0.0 && tem < min)
            {
                color = Driver.world.objects.get(i).color;
                min = tem;
            }
        Driver.image.buffer.setRGB(x,Driver.world.viewPlane.height-y-1,color.toInteger());
        }
    }
}
