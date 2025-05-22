//Java 16: Record(History)-cannot be modified and no status change(as no setter to change attribute)>
//!No setter
//!Getter
//!All args Constructor
//!record has no empty constructor as no setter by nature
//!no need to override 3寳in record-> equals(), hashCode(), toString() -> see DemoRecord


public record Person(String name, int age){ } //cannot extends Human //this class must have (), All args Constructor
  //!not allow to add other attributes
  //private string email; 

  public static final int VALUE =360; //OK to place static variable

//! You can still use "this" for writing your own methods
public String getInfo(){
  return this.name+" , "+ this.age;
}

//static method OK
public static int sum(int x, int y){
  return x+y;
}

@Override  //for fun -redefine same name means same object
public boolean equals(Object obj){
if (this==obj){
  return true;
  if(!(obj instanceof Person)){
  return false;
  }
  Person p1 =(Person) obj;
  this.name.equals(p1.name()); // no getName()
}
}

