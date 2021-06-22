import java.awt.*;
import javax. swing. *;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;
public class Draw extends JLabel
{
    protected void paintComponent(Graphics g){
        g.setColor(Color.black);
        g.fillRect(0,0,600,800);
        g.setColor(Color.gray);
        g.fillRect(0,0,600,50);
        g.fillRect(0,0,10,800);
        g.fillRect(575,0,600,800);
        g.fillRect(0,550,600,800);
        g.setColor(Color.white);
        g.drawString(String.valueOf(Clock.temp),560,20);
        BufferedImage photo = null;
        try {
            File file = new File("soundmatrix_start.png");
            photo = ImageIO.read(file);
        } catch (IOException e){
            g.drawString("Problem reading the file", 100, 100);
        }
        g.drawImage(photo, 10,50,565,550, null);
        g.fillRect(33,50,5,550);
        g.fillRect(66,50,5,550);
        g.fillRect(100,50,5,550);
        g.fillRect(133,50,5,550);
        g.fillRect(166,50,5,550);
        g.fillRect(200,50,5,550);
        g.fillRect(233,50,5,550);
        g.fillRect(266,50,5,550);
        g.fillRect(300,50,5,550);
        g.fillRect(333,50,5,550);
        g.fillRect(366,50,5,550);
        g.fillRect(400,50,5,550);
        g.fillRect(433,50,5,550);
        g.fillRect(466,50,5,550);
        g.fillRect(500,50,5,550);
        g.fillRect(533,50,5,550);
        g.fillRect(566,50,5,550);
        
        repaint();
    } 
}