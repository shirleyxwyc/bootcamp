import java.math.BigDecimal;

public class Item {
  //Creating a class of shopping item

//! Attributes
private double price;
private int quantity;

//!Constructor 
public Item (double price, int quantity) {
  this.price=price;
  this.quantity=quantity;
}

//! Setter Method
public void setPrice (double price) {
  this.price=price;
}

public void setQuantity (int quantity) {
  this.quantity=quantity;
}

//!Getter Method
public double getPrice () {
  return this.price;
}

public int getQuantity() {
  return this.quantity;
}

//!Presentation Method
public double amount () {
  return BigDecimal.valueOf(this.price)
        .multiply(BigDecimal.valueOf(this.quantity))
        .doubleValue();
}

public static void main(String[] args) {
  Item item = new Item(0.0,0);//The constructor initializes the object,
  System.out.println(item.amount());//0.0
  item.setPrice(10.0);
  item.setQuantity(3);
  System.out.println(item.amount());//30.0
  Item item1 = new Item(20.5,3);
  Item i2 = new Item(30.0,2);
  Item rice = new Item(99.9, 2);

rice.setPrice(50.0); //rice price was initialized at $ 99.9 and then set to $50.so still need setter if the item price was changed afterwards.
System.out.println(rice.amount());//100



}

}
