import java.util.HashMap;

public class UserProfile {
  private String firstName;
  private String lastName;
  private String email;

  public UserProfile(String firstName, String lastName, String email) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public String getEmail() {
    return this.email;
  }

  public static void main(String[] args) {
    UserProfile up1 = new UserProfile("John", "Chan", "jc@gmail.com");
    UserProfile up2 = new UserProfile("Mary", "Cheung", "mc@gmail.com");
    UserProfile up3 = new UserProfile("Lucas", "Lau", "ll@gmail.com");

    // "put()" is something similar to add().
    // put() -> add a whole entry into the HashMap

    HashMap<String, UserProfile> userMap = new HashMap<>();
    userMap.put("johnchan001", up1);
    userMap.put("marycheung100", up2);
    userMap.put("lucaslau999", up3);

    String userId = "marycheung100";


    UserProfile profile = userMap.get(userId); //! ?
    System.out.println(profile.getFirstName());//Mary
    System.out.println(profile.getLastName());//Cheung
    System.out.println(profile.getEmail());//mc@gmail.com

  }
  
  
}
