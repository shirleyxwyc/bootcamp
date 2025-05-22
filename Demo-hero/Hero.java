//public int maxHealthPoint;
//public int maxManaPoint;
//public int physicalAttack;
//public int physicalDefense;
//public int magicalAttack;
//public int magicalDefence;
//public int agility;
//public int criticalDamageChance;
//public int criticalDamage;
//RULE:MaxHP,MaxMP,PA,PD,MA,MD,AG,CDC,CD values are constants, only differ according to Role and Level
//new int[] {MaxHP,MaxMP,PA,PD,MA,MD,AG,CDC,CD}


public abstract class Hero {
  private int level;
  private int hp;
  private int mp;
  private Weapon [] weapons;

//Hero Constructor:
  public Hero(int level, int hp, int mp,Weapon [] weapons) {
    this.level = level;
    this.hp = hp;
    this.mp = mp;
    
  }

  public int getLevel() {
    return this.level;
  }

  public int getHp() {
    return this.hp;
  }

  public int getMp() {
    return this.mp;
  }
  
  public void levelUp() {
    this.level++;
}
  

}


//For 2D array:
  //public void levelup() {
    //this.level++;
    //if(this.level==2){
      //this.hp=Warrior.warriors[1][0];
      //this.mp=Warrior.warriors[1][1];
    //}else if (this.level==3) {
      //this.hp=Warrior.warriors[2][0];
      //this.mp=Warrior.warriors[2][1];
    //}
 

//For previous signle array
  //public void levelUp() {
    //this.level++;
    //if (this.level == 2) {
      //this.hp = Warrior.level2[0];
      //this.mp = Warrior.level2[1];
   //} else if (this.level == 3) {
      //this.hp = Warrior.level3[0];
      //this.mp = Warrior.level3[1];
    //}

    
  
