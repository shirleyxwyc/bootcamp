public class Ball {
  private Color color;
  private int number;

  public Ball(Color color, int number){
    this.color=color;
    this.number=number;
  }

  public static enum Color{
    RED,BLUE;
  }

  public Color getColor(){
    return this.color;
  }

   public int getNumer(){
    return this.number;
  }

  @Override
public String toString(){
  return "Ball("
  +"Color: " + this.getColor()
  +" Number: " + this.getNumer();
}

}
