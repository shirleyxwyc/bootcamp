import java.util.ArrayList;

public class Zoo {
  private ArrayList<Animal> animals;

  public Zoo() {
    this.animals = new ArrayList<>();
  }

  public void add(Animal animal) {
    this.animals.add(animal);
  }

  public static void main(String[] args) {
    //ArrayList<Zoo> zoo1 = new ArrayList<>();
    Zoo zoo1= new Zoo();//!
    zoo1.add(new Cat());
    zoo1.add(new Lion());

    ArrayList<Cat> cats= new ArrayList<>();
    cats.add(new Cat());

    ArrayList<Lion> lions= new ArrayList<>();
    lions.add(new Lion());

    ArrayList<Animal> animals= new ArrayList<>();
    animals.add(new Cat());
    animals.add(new Lion());




  }
}
