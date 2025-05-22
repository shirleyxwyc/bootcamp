
//Advantage of Class BookShelf? more easy to present  as Class book could be present seperately 
public class Bookshelf {
  private static final int MAX_SIZE = 3; // constant
  private Book[] books;

  public Bookshelf() {
    books = new Book[0];
  }

  public Book[] getBooks() {
    this.books = books;
  }

  public boolean isFull() {
    return this.books.length >= MAX_SIZE;
  }

  public boolean add(Book newBook) {
    Book[] newBooks = new Book[this.books.length + 1];
    for (int i = 0; i < this.books.length; i++) {
      newBooks[i] = this.books[i];

      public Book remove(Book book){
        for (int i = 0; i < this.books.length; i++) {
          if(this.books[i].equals(book)){
            this.books[i]=null;
            return true;
          }
      }
return false;
    }

      newBooks[newBooks.length - 1] = newBook;
      this.books = newBooks;
      return true;
    }
  }


  public static void main(String[] args) {
    Bookshelf bookshelf = new Bookshelf();
    bookshelf.add(new Book("ABC", 1));
    bookshelf.add(new Book("ABC", 2));
    bookshelf.add(new Book("ABC", 3));


  }
}
