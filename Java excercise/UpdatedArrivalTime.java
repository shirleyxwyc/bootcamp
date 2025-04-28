//!This is JavaQuest11
/**
 * Input: arrivalTime = 15, delayedTime = 5
 * Output: 20 
 * Explanation: Reach at 15+5 = 20 (20:00).
 *
 */
public class UpdatedArrivalTime {
// You are given a positive integer arrivalTime denoting the arrival time of a
  // train in hours,
  // and another positive integer delayedTime denoting the amount of delay in
  // hours.
  // Calculate Delayed Arrival Time

//1. Attributes
private int arrivalTime;
private int delayedTime;

//2. Creating Setter Method
public void setArrivalTime (int arrivalTime) {
  this.arrivalTime=arrivalTime;
}

public void setDelayedTime (int delayedTime) {
  this.delayedTime=delayedTime;
}

//3. Creating Getter Method

public int getArrivalTime() {
  return this.arrivalTime;
}

public int getDelayedTime () {
  return this.delayedTime;
}


//4 Calculation Presentation
public int findDelayedArrivalTime() { //!why public static int findDelayedAT()??
  int sum =this.arrivalTime + this.delayedTime;
  if(sum>0 && sum>=24) {
      return sum-24;
    }
    return sum;
    
}




  public static void main(String[] args) {
//5. Creating new objects
UpdatedArrivalTime t1 =new UpdatedArrivalTime();
t1.setArrivalTime(15);
t1.setDelayedTime(5);
System.out.println(t1.findDelayedArrivalTime());//20

UpdatedArrivalTime t2 =new UpdatedArrivalTime();
t2.setArrivalTime(23);
t2.setDelayedTime(5);
System.out.println(t2.findDelayedArrivalTime());//4

UpdatedArrivalTime t3 =new UpdatedArrivalTime();
t3.setArrivalTime(18);
t3.setDelayedTime(6);
System.out.println(t3.findDelayedArrivalTime());//0



    //int delayedArrivalTime1 = findDelayedArrivalTime(15, 5); // 20
    //int delayedArrivalTime2 = findDelayedArrivalTime(23, 5); // 4
    //int delayedArrivalTime3 = findDelayedArrivalTime(18, 6); // 0
  
  


}
}













