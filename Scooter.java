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
      this.isBroken = false;
      Scooter.nextSerial++;
      
   }
   //methods below
   
 

}