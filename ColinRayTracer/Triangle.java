public class Triangle implements Geometry
{
    public Vector[] threePoints = new Vector[3];

    public Triangle(Vector[] threePoints)
    {
    for(int i = 0; i < 3; i++)
    {
        this.threePoints[i] = threePoints[i];
    }
    }
    public Triangle(Vector one, Vector two, Vector three)
    {
        this.threePoints[0] = one;
        this.threePoints[1] = two;
        this.threePoints[2] = three;
    }
    public Vector get(int index)
    {
        return this.threePoints[index];
    }
    public Vector getFirstPoint()
    {
        return this.threePoints[0];
    }
    public Vector getSecondPoint()
    {
        return this.threePoints[1];
    }
    public Vector getThirdPoint()
    {
        return this.threePoints[2];
    }
    public void setFirstPoint(Vector one)
    {
        this.threePoints[0] = one;
    }
    public void setSecondPoint(Vector two)
    {
        this.threePoints[1] = two;
    }
    public void setThirdPoint(Vector three)
    {
        this.threePoints[2] = three;
    }

    @Override
    public TAndNormal intersect(Ray ray) 
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
        return new TAndNormal(-1, null);
    }
}
