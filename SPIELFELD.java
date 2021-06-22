import javax.swing.JFrame;
public class SPIELFELD
{
    private static final int rasterGroesse = 30;
    private static final int hoeheFenster = rasterGroesse * 20;
    private static final int breiteFenster = rasterGroesse * 26;
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
}
