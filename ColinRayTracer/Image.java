import java.awt.image.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Image 
{
    public BufferedImage buffer;
    public File image;
    public Image(String fileName)
    {
        image = new File(fileName);
        buffer = new BufferedImage(Driver.world.viewPlane.width,Driver.world.viewPlane.height,BufferedImage.TYPE_INT_RGB);
    }
    public void write(String fileType)
    {
        try{ 
            ImageIO.write(buffer, fileType, image);
        } catch (IOException e) {
            System.out.println("Could not write the Image");
            System.exit(1);
        }
    }
}
