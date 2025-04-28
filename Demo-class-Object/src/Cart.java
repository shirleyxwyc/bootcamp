import java.math.BigDecimal;
import java.util.Arrays;

public class Cart { //shopping cart
  
  private Item[] items; //items stores a addres of array on the Cart Object , can not .length as no object

  //constructor
  public Cart(){
    this.items=new Item[0]; //create a items array with 0 length,so that ??唔會爆？
  }
  
  public Item[] getItems() {
    return this.items; //this.items is not the items(but a reference) on line6
  }

  public int size() {  //cart size
    return this.items.length;
  }

//! create new item array and add original items exists in the old array to new array with length +1 ->new Item[this.items.length + 1]
  public void add(Item item) {  //!why public void?? //because add item --> so no need to return -->void
    Item[] newItems = new Item[this.items.length + 1];
    for (int i = 0; i < this.items.length; i++) { //copying old items array to new item array
      newItems[i] = this.items[i];
    }
    // =item below means the contructor created in the item.java-->public Item(double price, int quantity) {this.price = price;this.quantity = quantity;}
    newItems[newItems.length - 1] = item;//newItems[newItems.length - 1] means the last box of the array, 
    this.items = newItems; //change reference back,this.items always there=point back to newItems
  }


//presentation checkout amount();
public double checkoutAmount() { //for loop to loop the item array
  BigDecimal amount = BigDecimal.valueOf(0.0);
  for (int i = 0; i < this.items.length; i++) {
    amount = BigDecimal.valueOf(this.items[i].amount()).add(amount);
  }
  return amount.doubleValue();
}



public static void main(String[] args) {
  
// Creating new objects
Cart cart = new Cart(); 
Item rice = new Item(99.9,2);
Item water =new Item(4.5,7);
Item fish =new Item(30.0,4);
System.out.println(cart.size()); // 0

cart.add(rice);
cart.add(water);
cart.add(fish);

System.out.println(cart.size()); // 3
System.out.println(cart.getItems()[2].getQuantity()); // 4



//int[] arr = new int[3]; // fixed length
    //arr[0] = 10;
    //arr[1] = 100;
    //arr[2] = -2;
    //System.out.println(Arrays.toString(arr)); // [10, 100, -2]
   // int[] arr2 = arr; // backup the address of array object

    //arr = new int[4];
    //System.out.println(Arrays.toString(arr)); // [0, 0, 0, 0]
    //System.out.println(Arrays.toString(arr2));

    //String s = "hello";
    //System.out.println(s); // printing the value in the address of object
    //s = "hello1"; // new String object
    //System.out.println(s); // different address

    //

}

}
