import java.math.BigDecimal;

public class Cart {

  // !Attributes://Each cart has zero to many items ,and items are holds in array Object
  //private type[] arrayName-> Classname[] arrayName in camelCase / data type [] arrayName in camelCase
  //Use plural nouns to indicate it's a collection 

  private Item[] items;
  
  //"items" is just the array name, not related to the Item Class. "goods" is replacable term.
  // Since Item class is created before so we must use same class name "Item" for the return type "Item[]"
  // "Item[]" is the type, not an array yet.
  // "Item[]" is privately encapsulated so no setter. the only way to change/add the Item array is by line below-public void add(Item item)
  // "Item[] items" is a reference address to a zero-sized array on Item objects.
  // zero-size means the array has 0 length. cannot use ".length" to find the size.


  // !Constructor:
  // Initializes items as an empty array (length = 1 and default to 0) when a Cart object is created.
  // This ensures the cart starts with no items (instead of leaving items as null).

  public Cart() {
    this.items = new Item[0]; // initialize the array with 0 length 
  } // !"this.items" is the reference stored in the Cart object pointing to the Item[] array (empty array with length 1 at line 17)


  // !Setter Method:
  // --

  // !Getter Method:
  public Item[] getItems() {
    return this.items;
  } // !calls the Getter method to returns the ORIGINAL array reference"this.items" stored in the Trolley object pointing to the Item[] array

  public int size() {
    return this.items.length;
  } // return the item array length(i.e., Cart size)
  

  // !Presentation Method:

  // create new item array and add original items existed in the old array to new array with length +1
  // new Item[this.items.length + 1]
  //Setter:
  public void add(Item item) {//!why public void?? //because add item --> so no need to return -->void
    Item[] newItems = new Item[this.items.length + 1];
    for (int i = 0; i < this.items.length; i++) {
      newItems[i] = this.items[i]; // copy original items existed in the old array to new array
    }
    // "=item" below means the contructor created in the item.java-->public Item(double price, int quantity) {this.price = price;this.quantity = quantity;}
      newItems[newItems.length - 1] = item;// assign item to the last box of newItems array
      this.items = newItems; // change reference back,this.items always there=>point back to newItems
  }

  // .add amount
public double checkoutAmount() {
  BigDecimal amount = BigDecimal.valueOf(0.0) ; 
  for (int i=0; i<this.items.length;i++) {
    amount=BigDecimal.valueOf(this.items[i].amount()).add(amount);
  }
  return amount.doubleValue();
  }



  public static void main(String[] args) {
    Cart cart = new Cart(); // Assigns the newly created Cart object to the cart variable
    Item rice = new Item(99.9, 2);
    Item water = new Item(4.5, 7);
    Item fish = new Item(30.0, 4);
    System.out.println(cart.size());//!0--> no item object is added to cart
    cart.add(fish);//--cart.getItems()[0]
    cart.add(rice);//--cart.getItems()[1]
    cart.add(water);
    System.out.println(cart.size());//2 -->this.items.length=2
    System.out.println(cart.getItems()[0].getQuantity());//4
    System.out.println(cart.getItems()[1].getQuantity());//2
    System.out.println(cart.checkoutAmount());//319.8

    double total = cart.checkoutAmount();
    System.out.println(total);

  }



}
