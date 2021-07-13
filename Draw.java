import java.awt.*;
import javax. swing. *;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;
public class Draw extends JLabel
{
    private static final int rasterGroesse = 40;
    private static final int hoeheFenster = rasterGroesse * 15;
    private static final int breiteFenster = rasterGroesse * 16;
    private static Draw o = null;
    private JFrame fenster = null;
    O_ITEM o_item;
    
    protected void paintComponent(Graphics g){
        g.setColor(Color.gray);
        g.fillRect(0,0,600,800);
         g.setColor(Color.white);
        g.drawString(String.valueOf(Clock.temp),560,20);       
        g.setColor(Color.BLACK);
        g.fillRect(10, 40, 560,560);
        g. setColor (Color. lightGray);
        for (int i = 0; i < 15; i++) {
            g.drawLine(10, 40 + i * rasterGroesse, 570, 40 + i * rasterGroesse);
            g.drawLine(rasterGroesse * i + 10, 40, rasterGroesse * i + 10, 600);
        }
        for (int i= 0; i < 14; i++){
            for (int j= 0; j < 14; j++){
                g.fillRect(rasterGroesse * j + 15, i * rasterGroesse + 45, 30, 30);
            }
        }
        repaint();
        o_item = new O_ITEM();

    }
    


}