package merrjepautomation;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * MerrJep Automation
 * @author firec0de
 */
public class UsersDatabase {
    private List<User> users;
    
      public UsersDatabase(){
          // Creates new array list of users
    users = new ArrayList<User>();
}           // Exception Handeling if User.txt file is not found
      public UsersDatabase(String filename) throws FileNotFoundException{
          this();
          this.readUsers(filename);
      }
      
      /*
       * Reads users line by line for the file users.txt
      */
    public void readUsers(String filename) throws FileNotFoundException{
      Scanner filereader = new Scanner(new File(filename));
      while(filereader.hasNext()){
          String username = filereader.next();
          String password = filereader.next(); 
        User u = new User(username, password);
       addUser(u);
          }
      filereader.close();   
      }
    
    /*
    Adds user to the array
    */
    public void addUser (User user){
    users.add(user);
    }
    
    /*
     * Searches of user in the array if it finds one it returns the user
     */
   public User findUser(String username, String password){
    for(User user : this.users){
        if (user.match(username, password)){ 
            return user;          
                }
    }
    return null;
    }
       }
