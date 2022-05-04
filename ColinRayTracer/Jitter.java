import java.util.Random;

public class Jitter extends Sampler
{
    public Random random;
    public Jitter(int samples)
    {
        this.samples = samples;
        random = new Random();
    }
    public Point2D sample(int row, int col, int x, int y)
    {
        Point2D point = new Point2D();
        point.x = x-Driver.world.viewPlane.width/2+(col+random.nextFloat())/samples;
        point.y = y-Driver.world.viewPlane.height/2+(row+random.nextFloat())/samples;

        return point;
    }
}
