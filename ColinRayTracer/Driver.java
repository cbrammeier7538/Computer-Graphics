
public class Driver
{
    public static World world;
    public static Image image;
    public static Tracer tracer;
    public static Sampler sampler;
    public static Projection projection;
    public static void main(String[] args)
    {
        long start = System.nanoTime();

        world = new World(1600, 900, 1.0);
        image = new Image("Image.png");
        tracer = new Tracer();
        sampler = new RegSample(8);
        projection = new Orthographic();

        for(int i = 0; i < world.viewPlane.height; i++)
        {
            for(int j = 0; j < world.viewPlane.width; j++)
            {
                tracer.trace(j,i);
            }
        }

        image.write("PNG");
        
        long end = System.nanoTime();

        System.out.println("Loop Time: " + (end-start)/1000000000.0F);
    }
}
