public class RegSample extends Sampler
{
    public RegSample(int samples)
    {
        this.samples = samples;
    }
    public Point2D sample(int row, int col, int x, int y)
    {
        // create point
        Point2D point = new Point2D();

        // make the point
        point.x = x-Driver.world.viewPlane.width/2+(col+0.5)/samples;
        point.y = y-Driver.world.viewPlane.height/2+(row+0.5)/samples;

        // return the point
        return point;
    }
}
