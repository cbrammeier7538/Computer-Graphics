public abstract class Projection 
{
    public Point camera;
    public Point lookAt;
    public double distance;
    public Vector u, v, w;

    public abstract Ray createRay(Point2D point);

    public void compute_uvw()
    {
        w = camera.sub_vec(lookAt);
        w.normalize();

        Vector up = new Vector(0.0001375, 1.0, 0.013235);

        u = up.cross(w);
        u.normalize();

        v = w.cross(u);
        v.normalize();
    }

}
