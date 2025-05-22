//Class Signature
//!Interface
//APIE->
public class File implements Readable , Writable{ //functions, skills 
  //!implements with interface

  private String content;

  public File (String content){
    this.content=content;
  }

  
  @Override //to fix compile error of "File"-red line
  public void read(){
System.out.println("I am reading the file " + this.content);


  }
public static void main(String[] args) {
  File f1 =new File("Hello World");
  f1.read();


}

}
