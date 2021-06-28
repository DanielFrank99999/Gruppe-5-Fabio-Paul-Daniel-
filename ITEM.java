
abstract class ITEM extends Draw
{
   int positionX;
   int positionY;
   char fall;
   ITEM()
   {
     positionX = 300;
     positionY = 0;
     Runterfallen ();
     fall = 'O';
   } 
}