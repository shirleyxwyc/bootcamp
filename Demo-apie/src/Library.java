// Library, Book, Citizen
//extends, implements
//main:John, Mary(Citizen) -> want to borrow same book, John borrow first Book A->success
//Mary borrow BookA->Fail
public class Library implements Borrowable{
  private Bookshelf bookshelf;

  public Library (Book book1,Book book2,Book book3){
    Bookshelf bookShelf= new Bookshelf();
    bookshelf.add(book1);
    bookshelf.add(book2);
    bookshelf.add(book3);
    this.bookshelf=bookShelf;
  }


  public Book search(String bookName){
    for (int i=0; i<this.bookShelf.getBooks().length;i++) {
      if (this.bookShelf.getBooks()[i].getName().toLowerCase().contains(bookName.toLowerCase())){
        return this.bookShelf.getBooks()[i];
      }
    }
    return null;
  }

  public boolean remove(Book book){ //write remove() in Bookshelf first
    return this.bookshelf.remove(book);
  }

  


  
  public int getSize() {
   return this.bookshelf.length;
  }

public static void main(String[] args) {
  
}
    
  }




