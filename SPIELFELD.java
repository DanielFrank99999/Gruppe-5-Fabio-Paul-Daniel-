
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JFrame;
import java.awt.*;
import javax. swing. *;

public class SPIELFELD extends ITEM
{
   private static final int rasterGroesse = 35;
   private static final int hoeheFenster = rasterGroesse * 16;
   private static final int breiteFenster = rasterGroesse * 16;
   private static SPIELFELD o = null;
   private JFrame fenster = null;
   static int positionX;
   static int positionY;
   static char fall;
   O_ITEM o_item;
   I_ITEM i_item;
   J_ITEM j_item;
   Z_ITEM z_item;
   T_ITEM t_item;
   S_ITEM s_item;
   L_ITEM l_item;
   
    public static void main(String[] args)
   {
        JFrame fenster = new JFrame();
        fenster.setSize(600, 800);
        fenster.setVisible(true);
        fenster.setTitle("Tetris");
        fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenster.setResizable(false);
        fenster.setLayout(null);
        fenster.setLocationRelativeTo(null);
        Draw draw = new Draw();
        draw.setBounds(0,0,600,800);
        fenster.add(draw);
        new Clock();
        positionX = 1;  
        positionY = 1;
        fall = 'O';
        int min = 1;
        int max = 7;
        Runterfallen();
        for(int i = 1; i <=7; i++) 
        {
            int getRandomValue = ThreadLocalRandom.current().nextInt(min, max) + min;

            System.out.println(getRandomValue);
        }
   }
    
   static JFrame FensterGeben ()
   {
        if (o == null)
        {
            o = new SPIELFELD ();
        }
        return o. fenster;
   }

    /**
     * Gibt die Rastergröße zurück.
     * @return Ausgabefenster
     */
   static int RasterGroesseGeben ()
   {
        return rasterGroesse;
   }

    /**
     * Gibt die Breite des Fensters zurück.
     * @return Fensterbreite
     */
   static int FensterBreiteGeben ()
   {
        return breiteFenster;
   }

    /**
     * Gibt die Höhe des Fensters zurück.
     * @return Fensterhöhe
     */
    static int FensterHoeheGeben ()
    {
        return hoeheFenster;
   }
   
    static void Runterfallen ()
   {
       int getRandomValue = ThreadLocalRandom.current().nextInt(0, 7) + 1;
       switch ( fall )
       {
           case '1':
                ITEM o_item = new ITEM();
                break;
           case '2':
                ITEM l_item = new ITEM();
                break;
           case '3':
                ITEM s_item = new ITEM();
                break;
           case '4':
                ITEM i_item = new ITEM();
                break;
           case '5':
                ITEM z_item = new ITEM();
                break;
            case '6':
                ITEM t_item = new ITEM();
                break;
           case '7':
                ITEM j_item = new ITEM();
                break;
       }
   }
}
