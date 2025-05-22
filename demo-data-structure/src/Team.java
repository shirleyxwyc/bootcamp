import java.lang.reflect.Array;
import java.util.LinkedList;

public class Team {
  //array, ArrayList
  //Usage 99% same as ArrayList
  //LinkedList can store next staff as well as previous staff
  private LinkedList<Staff> staffs; //用while loop underlying
  //private ArrayList<Staff> staffs; what's the difference if using ArrayList? array length increased expotentially,new a new Array and copy, need many memory
  //private Staff[]staffs -> use array-> when add()->new a new Array and copy, need many memory

  public Team (){
    this.staffs= new LinkedList<>();
  }

  //Add to tail->LinkedList
  public void add(Staff staff){
    this.staffs.add(staff); //No Array implementation
  }//staffs like birdOwner

  //ArrayList
  public int size(){
    return this.staffs.size();
  }

  public boolean remove(long staffId){
    return this.staffs.remove(new Staff(staffId));
  }

  public static void main(String[] args) {
    Team team = new Team();
    team.add(new Staff(1L));
    team.add(new Staff(2L));

    System.out.println(team.size());//2-> run for loop to fins the size

team.remove(2L);
System.out.println(team.size()); //1

//Difference between ArrayList and LinkedList
//1) Underlying Data structure: ArrayList(array); LinkedList (object link object)
//Array -> Fixed length so if we need to add() ->need to recreate new array -> copy elements-> need many memory
// 1. can quickily locate element's by array position
//LinkedList-> always store the first and last element of the LinkedList-> if we need to add()->no need to create new array and no for loop needed to addNext
// 1. stores first and last
// 2. Each node contains the previous and next




  }

}
