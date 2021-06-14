import java.awt.*;
import javax. swing. *;

public class Draw extends JLabel
{
    protected void paintComponent(Graphics g){
        g.setColor(Color.black);
        g.fillRect(0,0,600,800);
        g.setColor(Color.white);
        g.drawString(String.valueOf(Clock.temp),20,20);
        g.fillRect(95,250,400,400);
        repaint();
    } 
}