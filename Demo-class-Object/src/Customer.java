import java.math.BigDecimal;

public class Customer { //blueprint / Instruction menu
//!class content

//1個客人有好多order，1個order 有好多items
//refer to class.java
//VIP --> accumulated amounts of all orders for a particular customer >=$10000(boolean method idVIP())
//customer1.isVIP()->true/false

//! Attributes
//private--> by default, this object is not readable
private String name;
private String email;
private Order[]orders;//1個客人有好多order，1個order 有好多items

//! add constructor
public Customer () {
  this.orders = new Order[0];
}



//Setter
public void setName(String name) {
  this.name =name;
} 

public void setEmail(String email) {
  this.email =email;
} 

//Getter
public String getName() {
  return this.name;
}
public String getEmail() {
  return this.email;
}


//!Method
//add order
public void add(Order order) {  //first "Order" as a type of second "order" like "String" "s"
  Order [] newOrders = new Order[this.orders.length+1];
  for (int i= 0; i<this.orders.length; i++) {
    newOrders[i] = this.orders[i]; 
  }
  newOrders[newOrders.length-1] = order;
  this.orders = newOrders; 
}

public boolean isVIP () { // 2 for loop , the 1st loop is from Order.java for (int i = 0; i < this.items.length; i++) {amount = BigDecimal.valueOf(this.items[i].amount()).add(amount);}
BigDecimal total = BigDecimal.valueOf(0.0);
for ( int i=0; i<this.orders.length; i++) { //2nd for loop
  total = total.add(BigDecimal.valueOf(this.orders[i].amount()));
}
return total.doubleValue()>=1000;
}


//!the below main method is not a must for a class file  it is a run button inside the class{}
  public static void main(String[] args) {
BigDecimal bd = new BigDecimal("1.3");

    //!Create Object(new..)
    Customer john = new Customer(); //john is a ball which consist of attributes, name , email...
    john.setName("John Chan");
    john.setEmail("john@gmail.com");
    Customer mary = new Customer();
    mary.setName("Mary Wong");
    mary.setEmail("mary@gmail.com");
  
    String name = john.getName();
    String email = john.getEmail();
    System.out.println(name);
    System.out.println(email);

    System.out.println(mary.getName());
    System.out.println(mary.getEmail());

    Order order1 = new Order();
    order1.add(new Item(15.3,9));
    order1.add(new Item(2.5,3));
    john.add(order1);

    Order order2 = new Order();
    order2.add(new Item(1000.3,9));
    mary.add(order2);
    System.out.println(mary.isVIP());//false
    
    Order order3 = new Order();
    order3.add(new Item(200.5,10));
    mary.add(order3);
    System.out.println(mary.isVIP());//true
    





  }
  
}
