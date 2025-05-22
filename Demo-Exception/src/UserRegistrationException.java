import java.util.Scanner;

public class UserRegistrationException extends RuntimeException {

  public UserRegistrationException(String message) {
    super(message); // call parent constructor, then the parent store the message
  }



  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter username: ");
    String username = scanner.nextLine();

    System.out.print("Enter password: ");
    String password = scanner.nextLine();

    System.out.print("Enter email: ");
    String email = scanner.nextLine();
    scanner.close();
  

  
    try {
      validateUsername(username);
      validatePassword(password);
      validateEmail(email);
      System.out.println("UserRegistration succeeds.");
    } catch (IllegalArgumentException e) {
      throw new UserRegistrationException(e.getMessage());
    }
  }
  



  public static void validateUsername(String username) {
    if (username == null || username.isEmpty()) { // or write "".equals(username) . becareful->check null first! otherwise username.equals("") will cause error if null
      throw new IllegalArgumentException("Invalid Username");
    }
  }

  public static void validatePassword(String password) {
    boolean withContainSpecialChar =
        password.contains("!") || password.contains("@")
            || password.contains("$") || password.contains("&");
    if (password == null || password.isEmpty() || password.length() < 8
        || !withContainSpecialChar) {
      throw new IllegalArgumentException("Invalid Password.");
    }
  }

  public static void validateEmail(String email) {
    if (email == null || email.isEmpty() || !email.contains("@")) {
      throw new IllegalArgumentException("Invalid email.");
    }
  }
}


