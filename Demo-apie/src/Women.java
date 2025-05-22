public class Women {
  private Direction direction;

public Woman(){
  this.direction= Direction.NORTH;
}


//
public String getDirection(){
if(this.direction==Direction.EAST)
return "EAST";
else if (this.direction==Direction.NORTH)
return "NORTH";
else if (this.direction==Direction.SOUTH)
return "SOUTH";
else
return "WEST";
}

//North(1)->turn left->West(3)
public Direction turnLeft(){ //4-1+4%4=3
  int result =(this.direction.getValue()-1+4)%4; //result=3 ->West
  this.direction=Direction.of(result);
  return this.direction; //West
}


}
