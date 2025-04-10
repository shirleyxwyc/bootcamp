public class exercise {
  public static void main(String[] args){
    //equals
    //length() //!no need to put parameter inside () variavle.length()
    //charAt //!

    String a = "Shirley";
    System.out.println(a);

    a.equals("Shirley");
    System.out.println(a.equals("Shirley")); //true

    System.out.println(a.length()); //7
    
    a.charAt(0);//0 is index
    System.out.println(a.charAt(0)); //S

    //Naming convention - Java
    String studentName = "John";
    studentName.equals("John");//True
    System.out.println(studentName);//John
    studentName.charAt(0);
    System.out.println(studentName.charAt(0)); //0
    //!System.out.println(studentName.charAt(10)); // 10 is out of angesystem error, can not execute
    System.out.println(studentName.length()); //4



  }
  
}
