import javax.swing.JFrame;
public class SwingFenster
{
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
        fenster.setSize(600, 400);
        fenster.setVisible(true);
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
