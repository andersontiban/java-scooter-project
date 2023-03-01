import java.util.*;
import java.util.ArrayList;

public class ScooterApp{
   //instance fields
   private Hashtable<String, ArrayList<String>> locations;   
   
   //constructor
   ScooterApp(){
      this.locations = new Hashtable<String, ArrayList<String>>();
      ArrayList<String> loc1 = new ArrayList<String>();
      ArrayList<String> loc2 = new ArrayList<String>();
      this.locations.put("loc1", loc1);
      this.locations.put("loc2", loc2);
   }


   //methods
   
   public static void main(String[] args){
      ScooterApp app = new ScooterApp();
      System.out.println(app.locations);
   }
   
}