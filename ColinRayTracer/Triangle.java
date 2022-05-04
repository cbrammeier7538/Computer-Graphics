/*import javax.lang.model.util.ElementScanner14;

public class Triangle extends GeoObject
{
    public Point One;
    public Point Two;
    public Point Three;
    public Triangle(Point One, Point Two, Point Three)
    {
        this.One = One;
        this.Two = Two;
        this.Three = Three;
    }
    public Point get(int index)
    {
        if(index == 1)
        {
            return this.One;
        }
        else if(index == 2)
        {
            return this.Two;
        }
        else if(index == 3)
        {
            return this.Three;
        }
        else
        {
            return this.One;
        }
    }
    public Point getFirstPoint()
    {
        return this.One;
    }
    public Point getSecondPoint()
    {
        return this.Two;
    }
    public Point getThirdPoint()
    {
        return this.Three;
    }
    public void setFirstPoint(Point one)
    {
        this.One = one;
    }
    public void setSecondPoint(Point two)
    {
        this.Two = two;
    }
    public void setThirdPoint(Point three)
    {
        this.Three = three;
    }
/*
    @Override
    public double hit(Ray ray)
    {
        Plane plane = new Plane(threePoints);
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
