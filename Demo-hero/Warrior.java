//weapon + PA and +MA 
//each role has his own weapon
//level 2 role could have level 1 weapon and level 2 weapon ...etc
//Archer c
//Warrior -> SWORD
//Archer-> BOW
//Mage -> STAVE

public class Warrior extends Hero {
  //RULE:MaxHP,MaxMP,PA,PD,MA,MD,AG,CDC,CD values are constants, only differ according to Role and Level
  //new int[] {MaxHP,MaxMP,PA,PD,MA,MD,AG,CDC,CD}
  //public static final int[] level1 =
      //new int[] {200, 50, 10, 5, 8, 4, 20, 40, 5};
  //public static final int[] level2 =
      //new int[] {220, 50, 10, 5, 8, 4, 20, 40, 5};
  //public static final int[] level3 =
      //new int[] {240, 50, 10, 5, 8, 4, 20, 40, 5};

public static final int[][] warriors =
new int [][]{{200, 50, 10, 5, 8, 4, 20, 40, 5},
{220, 50, 10, 5, 8, 4, 20, 40, 5},
{240, 50, 10, 5, 8, 4, 20, 40, 5}};

//Constructor Rule: all heros created start with level 1 ONLY
//for Warrior level 1-> Maxhp:200, Maxmp=50

public Warrior() {
super(1,warriors[0][0],warriors[0][1]);
}

//this is for single array, replaced by 2D array as above
  //public Warrior() {
    //super(1, level1[0], level1[0]); 
  //}

public int getMaxHp() {
  if(super.getLevel()==1){
    return warriors[0][0];
  }else if (super.getLevel()==2) {
    return warriors[1][0];
  }else if (super.getLevel()==3) {
    return warriors[2][0];
  }
  return -1;
}

//Previous for single array
  //public int getMaxHp() {
    //if (super.getLevel() == 1)
      //return level1[0];
    //else if (super.getLevel() == 2)
      //return level2[0];
    //else if (super.getLevel() == 3)
      //return level3[0];
    //return -1;
  //}

  public int getMaxMp() {
    if(super.getLevel()==1){
      return warriors[0][1];
    }else if (super.getLevel()==2) {
      return warriors[1][1];
    }else if (super.getLevel()==3) {
      return warriors[2][1];
    }
    return -1;
  }
  public int getPA() {
    if(super.getLevel()==1){
      return warriors[0][2];
    }else if (super.getLevel()==2) {
      return warriors[1][2];
    }else if (super.getLevel()==3) {
      return warriors[2][2];
    }
    return -1;
  }

public static void main(String[] args) {
 System.out.println(warriors.length);
    //Warrior w1 = new Warrior();
    //System.out.println(w1.getMaxHp()); // 200
    //System.out.println(w1.getHp()); // 200
    //w1.levelUp();
   // System.out.println(w1.getMaxHp()); // 220
    //System.out.println(w1.getHp()); // 220
}


  

}




