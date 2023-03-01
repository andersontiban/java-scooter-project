import java.util.*;
import java.util.ArrayList;

public class ScooterApp{
   //instance fields
   private Hashtable<String, ArrayList<Scooter>> stations;
   private Hashtable<String, User> registeredUsers; 
   //declaring list for locations hashtable
   ArrayList<Scooter> loc1 = new ArrayList<Scooter>();
   ArrayList<Scooter> loc2 = new ArrayList<Scooter>(); 
   ArrayList<Scooter> loc3 = new ArrayList<Scooter>();     
   
   //constructor
   ScooterApp(){
      //initilaize hashtable
      this.stations = new Hashtable<String, ArrayList<Scooter>>();
      //add list as value in hashtable
      this.stations.put("loc1", loc1);
      this.stations.put("loc2", loc2);
      stations.put("loc3", loc3);
      
      //initilaize hashtable
      this.registeredUsers = new Hashtable<String, User>();
      
   }


   //methods
   //public User registerUser(User user){
   //     if(user.age)
   //
   //}
   
   
   
   
   
   
   
   public static void main(String[] args){
      ScooterApp app = new ScooterApp();
      
      
      
      System.out.println(app.stations);
      System.out.println(app.registeredUsers);
      
      //create user
      User user1 = new User("anderson", "tiban", 19);
      System.out.println(user1.getUsername());
      
   }
   
}