import java.util.concurrent.ThreadLocalRandom;
abstract class ITEM extends Draw
{
   int positionX;
   int positionY;
   char fall;
   
   ITEM()
   {
       positionX = 1;
       positionY = 1;
       Runterfallen ();
       fall = 'O';
   } 
   public static void main(String[] args) 
   {
        int min = 1;
        int max = 10;
        for(int i = 1; i <=10; i++) 
        {
        int getRandomValue = ThreadLocalRandom.current().nextInt(min, max) + min;

        System.out.println(getRandomValue);
        }
   }
   void Runterfallen ()
   {
       switch ( fall )
       {
           case 'O':
                break;
           case 'L':
                break;
           case 'S':
                break;
           case 'I':
                break;
           case 'Z':
                break;
           case 'T':
                break;
           case 'J':
                break;
       }
   }
}