import java.util.List;

public class Box {
  private List<Ball> balls;

  public Box(List<Ball> balls){
    this.balls=balls;
  }

   public List<Ball> getBalls() {
    return this.balls;
  }
   
    @Override
    public String toString(){
      return "List<Ball> (" + this.balls+")";
    }

}
