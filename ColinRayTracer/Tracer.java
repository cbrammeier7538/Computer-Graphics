public class Tracer 
{
    public void trace(int x, int y)
    {
        Color color = new Color(0.0F, 0.0F, 0.0F);
        boolean hit = false;

        for(int ro = 0; ro < Driver.sampler.samples; ro++)
        {
            for(int co = 0; co < Driver.sampler.samples; co++)
            {
                Point2D point = Driver.sampler.sample(ro, co, x, y);
                Ray ray = Driver.projection.createRay(point);

                double min = Double.MAX_VALUE;
                Color temColor = Driver.world.Background;

                for(int i = 0; i < Driver.world.objects.size(); i++)
                {
                    double temp = Driver.world.objects.get(i).hit(ray);

                    if(temp != 0.0 && temp < min)
                    {
                        min = temp;
                        hit = true;
                        temColor = Driver.world.objects.get(i).color;
                    }
                }
                color.add(temColor);
            }
        }
        color.divide(Driver.sampler.samples*Driver.sampler.samples);

        if(hit)
        {
            Driver.image.buffer.setRGB(x,Driver.world.viewPlane.height-y-1,color.toInteger());
        }
        else
        {
            Driver.image.buffer.setRGB(x,Driver.world.viewPlane.height-y-1, Driver.world.Background.toInteger());
        }
    }
}
