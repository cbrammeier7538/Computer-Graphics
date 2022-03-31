public class Camera {
    public Vector origin;
    public Vector lookAt;
    public Vector lookUp;
    double halfWidth;

    public Camera(Vector origin, Vector lookAt, Vector lookUp, double halfWidth){
        this.origin = origin;
        this.lookAt = lookAt;
        this.lookUp = lookUp;
        this.halfWidth = halfWidth;
    }
}
