  //1.Item.java -->price,quantity

import java.math.BigDecimal;

public class Item {

  //1. Attributes
  private double price;
  private int quantity;

//!new today: add constructor
  public Item() {
  }
  
  public Item(double price, int quantity) {
    this.price = price;
    this.quantity = quantity;
  }
//!new today: add constructor


  //2.Setter Method
  public void setPrice (double price) {
    this.price=price;
  }

  public void setQuantity (int quantity) {
    this.quantity = quantity;
  }

  //3.Getter Method
  public double getPrice() {
    return this.price;
  } 

  public int getQuantity() {
    return this.quantity;
  }

//Presentation Method
public double amount() {
  return BigDecimal.valueOf(this.price)
  .multiply(BigDecimal.valueOf(this.quantity))
  .doubleValue();
}
  public static void main(String[] args) {
    Item item1 = new Item();
    item1.setPrice(10.5);
    item1.setQuantity(2);
    System.out.println(item1.amount()); // 21.0



  }
}
