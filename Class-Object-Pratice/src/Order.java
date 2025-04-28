import java.math.BigDecimal;
import java.util.Arrays;
// 1個客人有好多order，1個order 有好多items
// refer to class.java
// VIP --> accumulated amounts of all orders for a particular customer >=$10000(boolean method idVIP())
// customer1.isVIP()->true/false


public class Order {
  // Static variable (Not related to Object, common values for all objects)
  public static long counter = 0;

  // Attribute
  private Item[] items;
  private String id;

  // Constructor
  public Order() {
    this.items = new Item[0];
    ++counter;
    this.id = "OB00000" + counter;
  }

  // Setter

  // Getter
  public Item[] getItems() {
    return this.items; // Returns the ACTUAL internal array reference
  }

  public int getOrderSize() {
    return this.items.length; // Returns Order size
  }

  // !Presentation Method
  public String getId() {
    return this.id;
  }

  public void addItem(Item item) {
    Item[] newItems = new Item[this.items.length + 1];

    for (int i = 0; i < this.items.length; i++) {
      newItems[i] = this.items[i];
    }
    newItems[newItems.length - 1] = item;
    this.items = newItems;
  }

  public double orderAmount() {
    BigDecimal amount = BigDecimal.valueOf(0.0);
    for (int i = 0; i < this.items.length; i++) {
      amount = BigDecimal.valueOf(this.items[i].amount()).add(amount);
    }
    return amount.doubleValue();
  }


  public static void main(String[] args) {
    Order order = new Order();// creating a new 'Order' object and "Order()" looks like a method call with no parameter().assigning it to the variable 'order'(a reference address).
    System.out.println(order.getOrderSize()); // 0
    Item computer = new Item(9999.90, 1);
    Item water = new Item(4.5, 7);
    order.addItem(computer);
    order.addItem(water);
    System.out.println(order.getOrderSize());
    System.out.println(Arrays.toString(order.getItems()));

    double total = order.orderAmount();
    System.out.println(total);// 10031.4

    Order order2 = new Order();
    Order order3 = new Order();
    System.out.println(order.getId());// OB000001
    System.out.println(order2.getId());// OB000002
    System.out.println(order3.getId());// OB000003


  }
}
