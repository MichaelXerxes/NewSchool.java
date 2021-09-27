package WorkingGUI.extraFiles;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class PictureJPGforpanel extends JPanel {
    private BufferedImage image;
    public PictureJPGforpanel(){
        super();
        File imageFile=new File("res/HolidayPicture.jpg");
        try {
            image= ImageIO.read(imageFile);
        }catch(IOException e) {
            System.err.println("Error reading the picture");
            e.printStackTrace();
        }
        Dimension dimension=new Dimension(image.getWidth(), image.getHeight());
        setPreferredSize(dimension);
    }
    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(image,0,0,this);
    }
}
