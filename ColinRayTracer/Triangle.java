/*import javax.lang.model.util.ElementScanner14;

public class Triangle extends GeoObject
{
    public Vector[] points = new Vector[3];
    public Triangle(Vector[] points)
    {
        for(int i = 0; i < 3; i++)
        {
            this.points[i] = points[i];
        }
    }
    public Triangle(Vector One, Vector Two, Vector Three)
    {
        this.points[0] = One;
        this.points[1] = Two;
        this.points[2] = Three;
    }
    public Vector get(int index)
    {
        return this.points[index];
    }
    public Vector getFirstPoint()
    {
        return this.points[0];
    }
    public Vector getSecondPoint()
    {
        return this.points[1];
    }
    public Vector getThirdPoint()
    {
        return this.points[2];
    }
    public void setFirstPoint(Vector one)
    {
        this.points[0] = one;
    }
    public void setSecondPoint(Vector two)
    {
        this.points[1] = two;
    }
    public void setThirdPoint(Vector three)
    {
        this.points[2] = three;
    }

    @Override
    public double hit(Ray ray)
    {
        Plane plane = new Plane(points);
        TAndNormal planeTAndNormal = plane.intersect(ray);

        Vector collision = ray.origin.plus(ray.direction.scale(planeTAndNormal.t));
        double abc = planeTAndNormal.normal;

        Plane planeOne = new Plane(threePoints[1], threePoints[0], threePoints[1].plus(abc));
        Plane planeTwo = new Plane(threePoints[2], threePoints[1], threePoints[2].plus(abc));
        Plane planeThree = new Plane(threePoints[0], threePoints[2], threePoints[0].plus(abc));

        float offsetOne = planeOne.offset(collision);
        float offsetTwo = planeTwo.offset(collision);
        float offsetThree = planeThree.offset(collision);

        if(offsetOne >= 0 && offsetTwo >= 0 && offsetThree >= 0)
        {
            return planeTAndNormal;
        }
        
    }
    
}
*/
