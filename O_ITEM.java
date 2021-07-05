import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import javax. swing. *;
class O_ITEM extends ITEM
{
    private static final int groesse = SPIELFELD. RasterGroesseGeben ();
    private int x;
    private int y;
    private JComponent anzeige;
    O_ITEM()
    {
        anzeige = new JComponent () {
            // Stellt das Rumpfelement auf dem Fenster dar.
            public void paintComponent (Graphics g)
            {
                g. clearRect (0, 0, groesse, groesse);
                g. setColor (Color. yellow);
                g. fillRect (0, 0, groesse - 1, groesse - 1);
                g. setColor (new Color (50, 200, 0));
                g. drawRect (0, 0, groesse - 1, groesse - 1);
                g. drawRect (1, 1, groesse - 3, groesse - 3);
                g. drawLine (0, 0, groesse - 1, groesse - 1);
                g. drawLine (1, 0, groesse - 1, groesse - 2);
                g. drawLine (0, 1, groesse - 2, groesse - 1);
                g. drawLine (0, groesse - 1, groesse - 1, 0);
                g. drawLine (1, groesse - 1, groesse - 1, 1);                
                g. drawLine (0, groesse - 2, groesse - 2, 0);
            }

        };
        anzeige. setVisible (true);
        anzeige. setSize (groesse, groesse);
        PositionSetzen (300, 0);
        
            
        

        
        
    }
}