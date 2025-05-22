// ! "extends Exception" -> InvalidPasswordException become "Checked Exception"
// ! required to handle it with a try-catch block or declare it in the method signature using "throws".
// customized exception defined by myself-> create individual exception class
public class InvalidPasswordException extends Exception {

  // Parent Class Exception by default have attribute of message
  public InvalidPasswordException(String message) {
    super(message);
  }

  // public String getMessage(){
  // return ""
  // }

  // length>8 and and eng characters:1
  // length>8 and and eng characters && contains number:2
  // length>8 and and eng characters && contains number:3
  public static void main(String[] args) {
    // ! During compile time, we have to handle "checked" exception
    // One of the "exception handling": try and catch
    // !The main method(Caller) uses a try-catch block to handle the InvalidPasswordException that might be thrown by isValidPassword.
    try {
      int result = InvalidPasswordException.isValidPassword("123456789");//! Caller handling the InvalidPasswordException thrown by isValidPassword()
      System.out.println(result);
    } catch (InvalidPasswordException e) {
      System.out.println("This is InvalidPasswordException: " + e.getMessage());
    }

  }



  // !method signature-> throws
  // potentially throw exception-> method caller has to handle exception
  public static int isValidPassword(String password)
      throws InvalidPasswordException { // !method signature-> throws
    // !indicates that this method can possibly throw an exception, specifically InvalidPasswordException.
    // ! requiring callers to handle it. ->the main method is the caller of the isValidPassword method.


    // length > 8 and contains english characters -> 1
    // Length > 8 and contains numbers and english characters -> 2
    // Length > 8 and contains numbers and english characters and speical char ($#!) -> 3
    // otherwise, throw InvalidPasswordException
    // loop + ascii code
    
    if (password == null || password != null && password.length() <= 8) {
      throw new InvalidPasswordException("Password Invalid. length<=8");// ! force you to "handle"
    }//becoz super(message) so able to input message -> e.getMessage() will catch this sentence is this error occurs
    
    boolean foundNumber = false;
    boolean foundEnglish = false;
    boolean foundSpecialChar = false;

    for (char ch : password.toCharArray()) {
      if (ch >= '0' && ch <= '9') {
        foundNumber = true;
      } else if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
        foundEnglish = true;
      } else if (ch == '#' || ch == '!' || ch == '$') {
        foundSpecialChar = true;
      }
    }
    if (!foundEnglish) {
      throw new InvalidPasswordException("Password Invalid. lacks Eng char");
    }//becoz super(message) so able to input message -> e.getMessage() will catch this sentence is this error occurs
    if (foundNumber) {
      if (foundSpecialChar) {
        return 3;
      } else {
        return 2;
      }
    }
    return 1;
  }
}


