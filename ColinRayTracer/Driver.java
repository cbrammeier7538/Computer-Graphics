import java.awt.image.*;
import java.awt.*;
import java.io.File;

import javax.imageio.ImageIO;

public class Driver
{
    public static void main(String[] args)
    {
        long start = System.nanoTime();
        int width = 640;
        int height = 480;

        File image = new File("Image.png");
        BufferedImage buffer = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);


        for(int i = 0; i < height; i++)
        {
            for(int j = 0; j < width; j++)
            {
                //render pixels.
                buffer.setRGB(i,j,500);
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
