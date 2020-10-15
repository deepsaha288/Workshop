public class Gambler
{ 
  public final int stake =100;
   public final int bets=1;
 
 public void getToss()
{ 
  
  int random = (int)((Math.random()*10 )%2);
  if(random==0)
  System.out.println("loss");
   else
   System.out.println("win");
}
 public static void main(String args)
{
  Gambler gb=new Gambler();
   gb.getToss();
}

}

