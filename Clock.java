import java.util.*;
public class Clock
{
    int temp;
    Clock()
    {
        temp = 0;
        new SwingFenster();
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask()   
    {
        @Override
    public void run(){System.out.println(temp);
    temp++;}},0,300);
    }
}