## Getting Started

public static boolean isValidPassword(String password) {
    if (password == null || password == null && password.length() <= 8) {
      return false;
    }
    boolean foundNumber = false;
    boolean foundEnglish = false;

    for (char ch : password.toCharArray()) {
      if (foundNumber && foundEnglish) {
        return true;
      }
      if (ch >= 48 || ch <= 57) {
        foundNumber = true;
      } else if (ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122) {
        foundEnglish = true;
      }
    }
    return false;
  }




  public class InvalidPasswordException extends Exception {
//Parent Class Exception by default have attribute of message


public InvalidPasswordException(){
 
}


public InvalidPasswordException(String message){
  super(message);
}


//length>8 and and eng characters:1
//length>8 and and eng characters && contains number:2
//length>8 and and eng characters && contains number:3
public static void main(String[] args) {
  //During compile time
  try{
  int result=isValidPassword("abcd1234");
  System.out.println(result);
  } catch(InvalidPasswordException e){  //e is the object in class so able to .getMessage()
    System.out.println("this is InvalidPasswordException:"+ e.getMessage());
  }
}


  
//!method signature-> throws
//potentially throw exception-> method caller has to handle exception
  public static int isValidPassword(String password) throws InvalidPasswordException {
    if (password == null || password != null && password.length() <= 8) {
      throw new InvalidPasswordException("Invalid Password Length<=8"); //becoz super(message) so able to input message//!error->force you to "handle" 
    }
    boolean foundNumber = false;
    boolean foundEnglish = false;
    boolean foundSpecialCharacter = false;
  
    for (char ch : password.toCharArray()) {
      if(ch>='0' && ch<='9'){
      foundNumber=true;
      } else if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
        foundEnglish = true;
      }else if (ch =='#' ||ch =='$' ||ch=='!'){
        foundSpecialCharacter=true;       
      }
    }
   if(foundEnglish){
    throw new InvalidPasswordException("Invalid Password .English not found");}
     if(foundNumber){
      if(foundSpecialCharacter)
      return 3;
    else
    return 2;
   }
  }
  


## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
