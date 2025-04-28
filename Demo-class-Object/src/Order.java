
public class Order {
//1個客人有好多order，1個order 有好多items
//refer to class.java
//VIP --> accumulated amounts of all orders for a particular customer >=$10000(boolean method idVIP())
//customer1.isVIP()->true/false

//! static variable (Not related to Object)-common value for all objects
private static long counter = 0;  //common area to carry something and able to accumulate something afterward, for example id number--> counter++ 
//counter no need getter as it is at common area

//!Attribute
private long id; //customer id
private Item [] items; 

//!Constructor
public Order() {
 

//public Items [] = getItems() { //why no need this time?
  //return this.items;
//}no need this as we have set static id at the begining so see below

++counter; //the counter add itself right before new id object is created in main
this.id=counter;
}


public Order(long id) { //no need to add item[]items as user don't know about id would be carried by array
this.items = new Item [0]; //better practice is initially 0 length
this.id=id;
}
//!how to auto gen unique id number for each order?

public int size () {
  return this.items.length; 
}




//! Method

public long getId() {
  return this.id;
}
//add item --> no need to return -->void
public void add(Item item) {
  Item [] newItems = new Item[this.items.length+1];
  for (int i= 0; i<this.items.length; i++) {
    newItems[i] = this.items[i]; 
  }

  newItems[newItems.length-1] = item;
  this.items = newItems; 

  public double amount() { //for loop to loop the item array
    BigDecimal amount = BigDecimal.valueOf(0.0);
    for (int i = 0; i < this.items.length; i++) {
        amount = BigDecimal.valueOf(this.items[i].amount()).add(amount);
      }
      return amount.doubleValue();
}
}


public static void main(String[] args) {
  Order order1 = new Order(); //counter-->1
  System.out.println(order1.getId());
  Order order2 = new Order();//counter-->2
  System.out.println(order2.getId());
  Order order3 = new Order();//counter-->3
  System.out.println(order3.getId());
  //order1.add(apple);





}

}
