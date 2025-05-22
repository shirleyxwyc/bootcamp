public class Book {

  private String name;
  private long id;
  private Library library;//book->libraby object

  public Book(String name, long id) {
    this.name = name;
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public long getId() {
    return this.id;
  }


  // !
  // this.book
  public boolean equals(Object obj) {
    if (this == obj) // object address
      return true;
    if (!(obj instanceof Book)) //! different address , check if obj is an object of book Class
      return false;
      Book book = (Book) obj;
    //return this.id==book.getId() ; //or
    return Objects.equals(this.id,book.getId())
    && Objects.equals(this.name,book.getName()) ;
    
  }



  public static void main(String[] args) {
    //!in Java, all class implitly extends Object
    Human h1 = new Superman("John");
    Object o1 = new Superman("John");

    //Superman sm = h1; //compile error
    Superman sm = (Superman) h1;

    Book b1= new Book("ABC",1);
    Book b2= new Book("ABC",2);
    System.out.println(b1.equals(b2));//false
    Book b3= new Book("ABC",1);
    System.out.println(b1.equals(b3));//true
    System.out.println(b1.equals(new Cat("IJK",1)));//false becoz 'new' means new address
    Book b4 =b1;
    System.out.println(b1.equals(b4));//true


    Animal a1= new Cat("Steven", 10);
    a1= new Dog ("Peter");
  System.out.println(a1 instanceof Cat);
  System.out.println(a1 instanceof Dog);
  
}
}
