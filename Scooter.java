public class Scooter{
   static int nextSerial = 1;
   
   //instance fields
   private String station;
   private User user;
   private int serial;
   private int charge;
   private boolean isBroken;;
   
   //constructor
   Scooter(String station){
      this.station = station;
      this.user = null;
      this.serial = Scooter.nextSerial;
      this.charge = 100;
      this.isBroken = false;
      Scooter.nextSerial++;
   }
   //methods below
   
   //rent method to User--------------------------------------------------------------------------------------------------------------------------
   public void rent(User user){
      if(this.charge > 20){
         if(!this.isBroken){
            this.station = null;
            this.user = user;
         }else{
            System.out.println("Scooter needs repair big bruh");
         }
      }else{
         System.out.println("This scooter needs to be charged");
      }
   
   }
   //dock scooter at a station--------------------------------------------------------------------------------------------------------------------
  // public void dock(station){
  //    
  // }
   //recharge scooter ------------------------------------------------------------------------------------------------------------------------
   public void recharge(){
      this.charge = 100;
   }
   //requestRepair scooter -------------------------------------------------------------------------------------------------------------------
   public void requestRepair(){
      this.isBroken = false;
      System.out.println("Yippee Scooter is repaired!");
   
   }
   
   public static void main(String[] args){
      Scooter scooter1 = new Scooter("West 3rd ");
     
   }
   
 

}