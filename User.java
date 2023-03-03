public class User{
   //instance fields
   private String username;
   private String password;
   private int age;
   private boolean loggedIn;
   
   
   //constructor
   User(String username, String password, int age){
      this.username = username;
      this.password = password;
      this.age = age;
      this.loggedIn = false;
   }
   
 
   //methods
   //login in method-----------------------------------------------------------------------------------------------------------------------------
   
   public void login(String password){
      if(this.password == password){
         this.loggedIn = true;
         System.out.println("Hooray successfully logged in");
      }else{
         System.out.println("Dang Incorrect Password");
      }
   }
   //logout method------------------------------------------------------------------------------------------------------------------------------
   
   public void logout(){
      this.loggedIn = false;
   }
   
   //getter methods --------------------------------------------------------------------------------------------------------------------------
   public String getUsername(){
      return this.username;
   }
   
    public String getPassword(){
      return this.password;
   }
   
    public int getAge(){
      return this.age;
   }
    public boolean getLoginStatus(){
      return this.loggedIn;
   }

}