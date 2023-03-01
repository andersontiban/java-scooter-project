import java.util.*;
import java.util.ArrayList;

public class ScooterApp{
   //instance fields
   private Hashtable<String, ArrayList<String>> stations;
   private Hashtable<String, User> registeredUsers; 
   //declaring list for locations hashtable
   ArrayList<String> loc1 = new ArrayList<String>();
   ArrayList<String> loc2 = new ArrayList<String>(); 
   ArrayList<String> loc3 = new ArrayList<String>();     
   
   //constructor
   ScooterApp(){
      //initilaize hashtable
      this.stations = new Hashtable<String, ArrayList<String>>();
      //add list as value in hashtable
      this.stations.put("loc1", loc1);
      this.stations.put("loc2", loc2);
      this.stations.put("loc3", loc3);
      
      //initilaize hashtable
      this.registeredUsers = new Hashtable<String, User>();
      
   }


   //methods
   
   public static void main(String[] args){
      ScooterApp app = new ScooterApp();
     
      
      System.out.println(app.stations);
      System.out.println(app.registeredUsers);
      
   }
   
}