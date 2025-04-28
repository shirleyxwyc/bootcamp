import java.math.BigDecimal;

public class Trolley {

  // Attribute
  private Item[] items;

  // Contributor
  public Trolley() { // no-arg constructor
    this.items = new Item[0];// initialize the array with 0 length
  }

  public Trolley(Item[] items) {
    this.items = items;// / Parameterized constructor (custom items)
  }

  // Setter
  public void setItems(Item[] items) {
    this.items = items;
  }

  // Getter
  public Item[] getItems() {
    return this.items;
  }
  public int getTrolleySize () {
    return this.items.length;
  }

  // Method
  public void addItem(Item item) {
    Item[] trolley = new Item[this.items.length + 1];
    for (int i = 0; i < this.items.length; i++) {
      trolley[i] = this.items[i];
    }
    trolley[trolley.length-1] = item;
    this.items = trolley;
  }

  public double checkoutAmount() {
    BigDecimal amount = BigDecimal.valueOf(0.0) ; 
    for (int i=0; i<this.items.length;i++) {
      amount = BigDecimal.valueOf(this.items[i].amount()).add(amount);
    }
    return amount.doubleValue();
  }
    


  public static void main(String[] args) {
    Trolley trolley = new Trolley();

    Item rice = new Item(99.9, 2);
    trolley.addItem(rice);
    Item television = new Item(5999.9, 1);
    trolley.addItem(television);

    double total = trolley.checkoutAmount();
    System.out.println(total);//6199.7



  }

}
