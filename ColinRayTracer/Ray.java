public class Ray 
{
    public Point origin;
    public Vector direction;

    public Ray(Point origin, Vector direction)
    {
        this.origin = new Point(origin);
        this.direction = new Vector(direction);
    }
}
