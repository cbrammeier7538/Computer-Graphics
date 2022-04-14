public class Plane extends GeoObject 
{
    Point point;
    Normal normal;
    Color color;
    public Plane(Point point, Normal normal, Color color)
    {
        this.point = new Point(point);
        this.normal = new Normal(normal);
        this.color = new Color(color);
    }
    public double hit(Ray ray)
    {
        double t = point.sub(ray.origin).dot(normal)/ray.direction.dot(normal);
        if(t > 0.0000000001) {
            return t;
        } else {
            return 0.0;
        }
    }
}
