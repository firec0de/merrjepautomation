package merrjepautomation;

/**
 * MerrJep Automation
 * @author firec0de
 */
public class User {    

private String username;
private String password;

   public User(String username, String password) {
    this.username = username;
    this.password = password;
    }
    // Getters for the username and the password that has been inputed
   public String getUsername(){
     return username;
}
   public String getPassword(){
     return password;
}
   /*
   * Matches the inputed username and password from the file
   */
   public boolean match(String aUserame, String aPassword){
       return this.username.equalsIgnoreCase(aUserame) 
               & this.password.equalsIgnoreCase(aPassword);
   }
   
}

