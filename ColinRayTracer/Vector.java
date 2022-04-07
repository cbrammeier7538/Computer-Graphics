public class Vector {
    public double x, y, z;
    public Vector()
    {
        x = 0.0;
        y = 0.0;
        z = 0.0;
    }
    public Vector(double x, double y, double z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Vector(Vector vector)
    {
        x = vector.x;
        y = vector.y;
        z = vector.z;
    }
    public Vector add(Vector vector)
    {
        return new Vector(x+vector.x, y+vector.y, z+vector.z);
    }
    public Vector sub(Vector vector)
    {
        return new Vector(x-vector.x, y-vector.y, z-vector.z);
    }
    public double dot(Vector vector)
    {
        return x*vector.x + y*vector.y + z*vector.z;
    }
    public double dot(Point point)
    {
        return x*point.x + y*point.y + z*point.z;
    }

    public double dot(Normal normal)
    {
        return x*normal.x + y*normal.y + z*normal.z;
    }

    public void normalize()
    {
        double magnitude = Math.sqrt(x*x + y*y + z*z);

        x /= magnitude;
        y /= magnitude;
        z /= magnitude;
    }
}
