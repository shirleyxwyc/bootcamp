package Quiz3;

public class Secret {
  int level=1; //! Instance variable

  static int staticLevel = 2; //! Static variable

  public static void main(String[] args) {
    Secret s1 = new Secret();
    Secret s2 = new Secret();

//!calling Instance Variable- need to new object to call
    System.out.println(s1.level);//1
    System.out.println(s2.level);//1
    s1.level=4; //object s1 reassign instance variable level to 4
    System.out.println(s1.level);//4
    System.out.println(s2.level);//1, remain unchanged

 //! calling static variable-invoke with Class name "Secret" or just calling method in same class's main
System.out.println("staticLevel is static variable = "+ staticLevel);//2
System.out.println(Secret.staticLevel);//2

staticLevel = 5; //reassign the value 5 to the static variable staticLevel for the entire Class
//All instances of the class will see this updated value.

System.out.println("staticLevel is static variable = "+ staticLevel); //5
System.out.println(Secret.staticLevel);//5

//object s2 can access a static variable but not recommend to do so
System.out.println(s2.staticLevel);//5 



  }
}
