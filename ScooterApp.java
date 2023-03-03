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


   //registerUser method---------------------------------------------------------------------------------------------
   public User registerUser(User user){
        if(user.getAge() > 18){
            //check if user object in userRegistered array. If not add them. If so dont
            if(this.registeredUsers.containsKey(user.getUsername())){
               System.out.println("Cannot register because user is already registered");
            }else{
               this.registeredUsers.put(user.getUsername(), user);
               System.out.println("User registered successfully");
            }
        }else{
         System.out.println("Cannot register User younger than 18");
        
        }   
        return user;
   }
   //login method---------------------------------------------------------------------------------------------------------------
   public void loginUser(User user, String password){
      user.login(password);
   }
   //logout method---------------------------------------------------------------------------------------------------------------
   public void logoutUser(User user){
      user.logout();
   }
   //create scooter method--------------------------------------------------------------------------------------------------------
   public Scooter createScooter(String station){
      if(!this.stations.containsKey(station)){
         System.out.println("station does not exsits");
         System.exit(0);
      }
      //creater new scooter
      Scooter newScooter = new Scooter(station);
      ArrayList<Scooter> list = this.stations.get(newScooter.getStation());
      list.add(newScooter);
      System.out.println("Scooter succefully added to station");
      return newScooter; 
   }
   
  
   
   public static void main(String[] args){
      ScooterApp app = new ScooterApp();

      //System.out.println(app.stations);
      //System.out.println(app.registeredUsers);
      
      //create user
      User user1 = new User("anderson", "tiban", 19);
      
      app.createScooter("loc1");
      app.createScooter("loc2");
      app.createScooter("loc2");
      app.createScooter("loc6");
      //left off at dock Scooter 
     
      
     
      
   }
   
}