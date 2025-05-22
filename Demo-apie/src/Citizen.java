// one way: Citizen -> find library-> find BookShelf->find Books
// book.getBorrower()? see if your system need this method

import java.util.Objects;

public class Citizen implements Borrowable {
  private String name;
  private Library library;
  private Book[] books;
  private String hkid;

  public Citizen(String name) {
    this.name = name;
  }

  public Citizen(String name, String hkid) {
    this.name = name;
    this.hkid = hkid;
  }

  public String getName() {
    return this.name;
  }

  public String getHkid() {
    return this.hkid;
  }

  public void setLibrary(Library library) {
    this.library = library;
  }

  @Override // !NEW
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof Citizen))
      return false;
    Citizen c1 = (Citizen) obj;
    return this.getHkid().equals(c1.getHkid());
  }

  @Override //!Case sensitive capital letter 'C'
  //!The defination of hashCode MUST BE same as equals() =same hkid only
    public int hashCode() {
    return Objects.hash(this.hkid); //!use hkid to get a unique int value
  }



  @Override
  public boolean borrow(Book book) {
    return this.library.remove(book);
  }

  public Integer search(String bookName) {
    Book book = this.library.search(bookName);
    return book != null ? book.getId() : null;
  }

  public static void main(String[] args) {

  }
}
