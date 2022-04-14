import java.awt.image.*;
import java.awt.*;
import java.io.File;

import javax.imageio.ImageIO;

public class Driver
{
    public static void main(String[] args)
    {
        long start = System.nanoTime();
        int width = 2000;
        int height = 2000;

        File image = new File("Image.png");
        BufferedImage buffer = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        Sphere sphere = new Sphere(new Point(0.0, 0.0, 0.0), 60.0, new Color(0.0F,1.0F,0.0F));
        for(int i = 0; i < width; i++)
        {
            for(int j = 0; j < height; j++)
            {
                Color color = new Color(0.0F,0.0F,0.0F);
                for(int row = 0; row < 8; row++)
                {
                    for(int col = 0; col < 8; col++)
                    {
                        // Ray with a point and a vector to see if intersections occur.
                        Ray ray = new Ray(new Point(0.25*(j-width/2+(col+0.5)/8), 0.25*(i-height/2+(row+0.5)/8),100), new Vector(0.0,0.0,-1.0));
                        if(sphere.hit(ray) != 0.0)
                        {
                            color.add(sphere.color);
                        }
                        else
                        {
                            
                        }

                    }
                }
                color.divide(64);
                buffer.setRGB(j, i, color.toInteger());
                // Ray with a point and a vector to see if intersections occur.
                //checking if it intersects the sphere
            }
        }

        try{
            ImageIO.write(buffer,"PNG",image);
        } catch (Exception e){
            System.out.println("could not write image.");
            System.exit(1);
        }
        
        long end = System.nanoTime();

        System.out.println("Loop Time: " + (end-start)/1000000000.0F);
    }
}
