import java.awt.*;
import javax. swing. *;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;
public class Draw extends JLabel
{
    private static final int rasterGroesse = 30;
    private static final int hoeheFenster = rasterGroesse * 20;
    private static final int breiteFenster = rasterGroesse * 26;
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
        g.drawImage(photo,10,50,565,550, null);
        g. setColor (Color. lightGray);
        for (int i = 1; i <= hoeheFenster / (rasterGroesse * 2); i++)
        {
             g. drawLine (0, hoeheFenster / 2 + i * rasterGroesse, breiteFenster - 1, hoeheFenster / 2 + i * rasterGroesse);
             g. drawLine (0, hoeheFenster / 2 - i * rasterGroesse, breiteFenster - 1, hoeheFenster / 2 - i * rasterGroesse);
             g. drawLine (0, hoeheFenster / 2, breiteFenster - 1, hoeheFenster / 2);
        }
        for (int i = 1; i <= breiteFenster / (rasterGroesse * 2); i++)
        {
             g. drawLine (breiteFenster / 2 + i * rasterGroesse, 0, breiteFenster / 2 + i * rasterGroesse, hoeheFenster - 1);
             g. drawLine (breiteFenster / 2 - i * rasterGroesse, 0, breiteFenster / 2 - i * rasterGroesse, hoeheFenster - 1);
             g. drawLine (breiteFenster / 2, 0, breiteFenster / 2, hoeheFenster - 1);
                }
        repaint();
    } 
}