public class Watch implements TimeKeeper
{
   private double seconds;
   
   public Watch(int aSeconds)
   
   {
       this.seconds = aSeconds;
   }
   
   public void reset() //resets seconds to 0
   
   {
       seconds = 0;
   }
   
   public void addToSeconds()
   
   {
      if (seconds >= 3600)
      
       {
         reset();   
       }
      
         else
         {
           seconds = seconds + 0.01;  
          }
   }
   
   public String displayTime()
   
   {
      return String.format("The timer says: " + String.format("%.1f seconds", seconds));
   }
   
   public void delayTime(int delay)
   
   {
       seconds = seconds + (delay * 0.01);
   }
}

//Tests

Watch w1 = new Watch(780);
System.out.println(w1.displayTime().toString());

Watch w1 = new Watch(0); w1.delayTime(76);
System.out.println(w1.displayTime().toString());

Watch w1 = new Watch(1000); w1.reset();w1.delayTime(1252);
System.out.println(w1.displayTime().toString());

System.out.println(new Watch(0) instanceof TimeKeeper);