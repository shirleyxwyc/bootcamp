public class Machine {
  // Attribute
  private boolean status;

  
  public Machine() { // initialization
    this.status = false;
  }

  // method
  public void turnOn() {
    this.status = true;
  }

  public void turnOff() {
    this.status = false;
  }

  //public boolean getStatus() {
    //return this.status;
  //}
  public String getStatus() {
    return this.status==true? "ON":"OFF";
  }

  public static void main(String[] args) {
    Machine m1 = new Machine();
    m1.turnOn(); 
    System.out.println(m1.getStatus());// true-->ON if getStatus return type changes to return String from boolean



  }

}
