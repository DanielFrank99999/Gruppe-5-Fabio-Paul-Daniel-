import java.util.*;
public class Clock
{
    static int temp;
    Clock()
    {
        temp = 0;
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask()   
    {
        @Override
    public void run(){
    temp++;}},0,999);
    }
}