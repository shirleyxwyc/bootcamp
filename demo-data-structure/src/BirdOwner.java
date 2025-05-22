public class BirdOwner {
  //! Array implementation
  //Private Bird[]birds;

  //!ArrayList implementation
  //Private ArrayList<Bird> birds;
  
  //! LinkedList immplementation (these code below shows the theory behind name list)
  private Bird head;

  public BirdOwner(Bird head){
    this.head=head;
  }

  public void add(Bird bird){
if(this.head==null){
  this.head=bird;
  return;
}//you are sure there are at least one bird
    Bird temp= this.head; //back up head first
    while (temp!=null) {
     if(temp.getNext()==null){
      break;
     }
     temp=temp.getNext();
    }
    temp.setNext(bird);
  }

public Bird lastBird(){
  if(this.head==null){
   return null;
  }//if no bird in head-> no bird at the last
  Bird temp= this.head; //back up head first
  while (temp!=null) {
   if(temp.getNext()==null){
    return temp;
   }
   temp=temp.getNext();
  }
  return null;
}

//Override



  public static void main(String[] args) {
BirdOwner bo = new BirdOwner(new Bird("Vincent", new Bird("Niko", new Bird("Ricky", null))));
Bird jacky =new Bird("Jacky", null);
bo.add(jacky);
bo.add(new Bird("Alex", null));

System.out.println(bo.lastBird().getName());//Alex




  }
}
