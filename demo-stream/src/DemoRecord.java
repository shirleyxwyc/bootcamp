public class DemoRecord {


  public static void main(String[] args) {
    Person p1 = new Person("John",13);
    //Person p2 = new Person(); //record has no empty constructor as no setter by nature
     Person p2 = new Person("John",13);

     //no need to override 3寳in record-> equals(), hashCode(), toString()
     System.out.println(p1.equals(p2));//true
     System.out.println(p1.hashCode()==p2.hashCode());//true
     System.out.println(p1);//Person[name=John, age=13]

System.out.println(p1.getInfo());//John , 13
System.out.println(Person.sum(3, 7));//10
System.out.println(Person.VALUE);//360


  }
}
