import java.util.*;
import java.util.ArrayList;

public class ScooterApp{
   //instance fields
   private Hashtable<String, ArrayList<String>> locations;
   //declaring list for locations hashtable
   ArrayList<String> loc1 = new ArrayList<String>();
   ArrayList<String> loc2 = new ArrayList<String>(); 
   ArrayList<String> loc3 = new ArrayList<String>();     
   
   //constructor
   ScooterApp(){
      //initilaize hashtable
      this.locations = new Hashtable<String, ArrayList<String>>();
      //add list as value in hashtable
      this.locations.put("loc1", loc1);
      this.locations.put("loc2", loc2);
      this.locations.put("loc3", loc3);
   }


   //methods
   
   public static void main(String[] args){
      ScooterApp app = new ScooterApp();
      
    
      app.loc1.add("scoot");
      
      app.loc3.add("scoot2");
      
      System.out.println(app.locations);
   }
   
}