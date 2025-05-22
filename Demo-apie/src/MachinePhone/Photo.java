public class Photo {
  private static long counter =0;
  private long id;

  public Photo() {
  this.id = ++counter;
  }

  public long getId(){
    return this.id;
  }

  //
  public boolean equals(Photo photo) {
    return this.id == photo.getId();
  }

  public String toString() {
    return "this photo id =" + this.id;
  }


  public static void main(String[] args) {

    Photo photo1 = new Photo();
    Photo photo2 = new Photo();
    System.out.println(photo2.getId());//2

    System.out.println(photo1.equals(photo2));
    System.out.println(photo2);
  }
}
