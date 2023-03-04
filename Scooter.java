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
            System.out.println("Scooter has been rented to the user :)");
         }else{
            System.out.println("Scooter needs repair big bruh");
         }
      }else{
         System.out.println("This scooter needs to be charged");
      }
   
   }
   //dock scooter at a station--------------------------------------------------------------------------------------------------------------------
  // public void dock(String station){
  //    //set scooter station to new station
        //remove user
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
   //getter method---------------------------------------------------------------------------------------------------------------------------
   public String getStation(){
      return this.station;
   }
   public User getUser(){
      return this.user;
   }
   
   public static void main(String[] args){
      Scooter scooter1 = new Scooter("West 3rd ");
     
   }
   
 

}