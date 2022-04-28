import java.util.ArrayList;

public class World 
{
    public ViewPlane viewPlane;
    public ArrayList<GeoObject> objects;
    public Color Background;
    
    public World(int width, int height, double size)
    {
        viewPlane = new ViewPlane(width,height,size);
        Background = new Color(100.0F, 64.7F, 0.0F);

        objects = new ArrayList<GeoObject>();
        objects.add(new Sphere(new Point(0.0, 0.0, 0.0), 50, new Color(0.0F, 0.0F, 0.0F)));
        objects.add(new Sphere(new Point(0.0,-200.0,0.0), 50, new Color(0.0F,1.0F,0.0F)));
        objects.add(new Sphere(new Point(100.0, 200.0, 0.0), 50, new Color(1.0F,0.0F,0.0F)));
    }
}
