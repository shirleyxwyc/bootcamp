public enum Direction {
//! someone help you call Direction(int value) to create Direction Object
  //4 enum object here
  EAST(1),//
  SOUTH(2),
  WEST(3),
  NORTH(4),
  ;

private int value;
//enum constructor ->private
private Direction(int value){
this.value=value;
}

public int getValue(){
  return this.value;
}

public Direction of(int value) {
  //for loop
  for (Direction d : Direction.values()){
    if(d.getValue()==value)
    return d;
  }
  return null;
}

public static void main(String[] args) {
  System.out.println(d.getValue());
}

}

