import javax.swing.JFrame;
import java.awt.*;
import javax. swing. *;
public class SPIELFELD
{
    private static final int rasterGroesse = 35;
    private static final int hoeheFenster = rasterGroesse * 16;
    private static final int breiteFenster = rasterGroesse * 16;
    private static SPIELFELD o = null;
    private JFrame fenster = null;
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
}
