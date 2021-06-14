import java.util.*;
public class Clock
{
    Clock()
    {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask()   
    {
        @Override
    public void run(){System.out.println("Test");}},0,300);
    }
}