public class Phone extends Machine {
  // inherit attribute from Machine->Status

  // Additional Attributes from Machine:
  private final String model; // final means it won't change after creating it and you can't setModel as well
  private Camera camera;
  private Photo[] photos;
  private int idx;

  // Constructor
  public Phone(String model) {
    this.model = model;
    this.camera = new Camera(); // revisit what happened if we exclude this sentense
    this.photos = new Photo[5];
    this.idx = 0;
  }

  public Camera getCamera() { // phone object has camera object (phone attribute) , so you can getCamera
    return this.camera;
  }

  // public void takePhoto() {
  // this.camera.takePhoto();
  // idx++;
  // }


  public boolean takePhoto() {
    if (this.idx >= photos.length) {
      return false;
    }
    this.photos[this.idx] = this.camera.takePhoto();
    this.idx++;
    return true;
  }

  // public void setModel (String model){ //once you have "final" the model, can not setModel
  // this.model=model;
  // }



  public static void main(String[] args) {
    Phone iphone4 = new Phone("IPHONE 4");
    // getStatus method inherited from Machine Class
    System.out.println("iphone 4 status = "+ iphone4.getStatus());// OFF
    iphone4.turnOn();
    System.out.println("iphone 4 status = "+ iphone4.getStatus());// ON

    
    System.out.println(iphone4.takePhoto());//true
    System.out.println(iphone4.takePhoto());//true
    System.out.println(iphone4.takePhoto());//true
    System.out.println(iphone4.takePhoto());//true
    System.out.println(iphone4.takePhoto());//true

  }


}
