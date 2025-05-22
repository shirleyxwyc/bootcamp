public class Zoo {
  private Animal[] animals;
  // private Cat cat;
  // private Dog dog;

  public Zoo() {
    this.animals = new Animal[3];
    this.animals[0] = new Cat("John", 2);
    this.animals[1] = new Dog("Peter");
    this.animals[2]= new Panda("Susan");
    // this.cat = new Cat("John", 2);
    // this.dog = new Dog("Peter");
  }
  
  //you won't type public Panda getPanda() to return panda as panda is added in animal array, box 2
  public Animal getPanda(){
    return this.animals[2];
  }
  public Animal getDog() {
    return this.animals[1];
  }

  public static void main(String[] args) {
    Zoo zoo1=new Zoo(); //There are 3 animals "John", Pater & Susan
    zoo1.getDog().sound();//wow
    zoo1.getPanda().sound();//Panda sounds
  
  
  }
}