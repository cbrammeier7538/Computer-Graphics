public class Perspective extends Projection 
{
    public Perspective(Point camera, Point lookAt)
    {
        this.camera = new Point(camera);
        this.lookAt = new Point(lookAt);
        this.distance = Driver.world.viewPlane.height/2/Math.ten(Math.toRadians(FOV));

        compute_uvw();
    }

    public Ray crossRay(Point2D point)
    {
        Ray ray = new Ray(new Point(camera), u.mult(point.x).add(v.mult(point.y).sub(v.mult(-distance))));
        ray.direction.normalize();

        return ray;
    }
}
