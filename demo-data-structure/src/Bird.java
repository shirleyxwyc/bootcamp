public class Bird {
  private String name;
  private Bird bird; // bird stores the address of next bird, like vincent stored the address of Nicole


  public Bird(String name, Bird bird) {
    this.name = name;
    this.bird = bird;
  }

  public Bird getNext() { //get next bird
    return this.bird;
  }

  public String getName() {
    return this.name;
  }

  public void setNext(Bird bird){
    this.bird=bird;
  }

  @Override
  public String toString(){
  return "Bird()"
  +"name= " +this.name
  +")";
}


  public static void main(String[] args) {
    Bird[] birds = new Bird[3];

    Bird vincent =
        new Bird("Vincent", new Bird("Niko", new Bird("Ricky", null)));
    
    System.out.println(vincent.getNext().getName());// Niko
    System.out.println(vincent.getNext().getNext().getName());// Ricky




  }
}
