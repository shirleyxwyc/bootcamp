public class SuperString {

  private char[] chs;

  //char array to string use string.valueof()

  //You define your own way to store the String value
  public void setString(String str) {
    this.chs = new char [str.length()];

  }


public char charAt(int index) {
  return this.chs[index];
}
  //this vs ss
  public boolean equals(SuperString ss) {
    if(this.chs.length !=ss.getString().length()){ //check if length are same
      return false;
    }
    for(int i=0; i< this.chs.length;i++) {
      if(this.chs[i] !=ss.getString().charAt(i)) { //check if any char are same
        return false;
      }
    }
    return true;
  }




  public static void main(String[] args) {
    SuperString ss1 = new SuperString();
    ss1.setString("abc");
System.out.println(ss1.charAt(0));//a

SuperString ss2 = new SuperString();
ss2.setString("abcd");
System.out.println(ss1.equals(ss2));

SuperString ss3 = new SuperString();
ss3.setString("abd");//false
System.out.println(ss1.equals(ss3));

SuperString ss4 = new SuperString();
ss3.setString("abcd");
System.out.println(ss1.equals(ss4));

//further ex
//!use replace tool


  }
}
