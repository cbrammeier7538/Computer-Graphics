

public class Sphere extends GeoObject
{
    public Point center;
    public double radius;
    public Color color;

    public Sphere(Point center, double radius, Color color)
    {
        this.center = new Point(center);
        this.radius = radius;
        this.color = new Color(color);
    }
    public double hit(Ray ray)
    {
        //(p-c)*(p-d) = r^2; 
        //(o+td-c)*(o+td-c)-r^2=0 (finding intersection from ray to sphere)
        //(d*d)t^2 + (2(o-c)*d)t + (0-c)*(o-c)-r^2 = 0;

        double a = ray.direction.dot(ray.direction);
        double b = 2*ray.origin.sub(center).dot(ray.direction);
        double c = ray.origin.sub(center).dot(ray.origin.sub(center))-radius*radius;
        double d = b*b-4*a*c;
        if(d < 0.0) {
            return 0.0;
        }
        else{
            double t = (-b - Math.sqrt(d))/(2*a);
            if(t > 0.0) {
                return t;
            } 
            else
            {
                return 0.0;
            }
        }
    }
}
