public class Day5DemoifPremiun8cases {
  public static void main(String[] args) {
    boolean isFemale = true;
    boolean isNonSmoker = false;
    int age = 50;
    double basicFee = 100;
    double extraRate = 0.0;
    // !double totalPremium = basicFee * (1 + extraRate); 點解要放在最底？

    //8 conditions in total: 
    // 1. Female, Smoker, >=40 --> 0.15
    // 2. Female, Smoker, below 40 -->0.12
    // 3. Female, Non-Smoker, >=40 --> 0.08
    // 4. Female, Non-Smoker, below 40 -->0.05
    // 5. Male, Smoker, >=70 --> 0.22
    // 6. Male, Smoker, below 70 -->0.07
    // 7. Male, Non-Smoker, >=70 -->0.15
    // 8. Male, Non-Smoker,below 70 -->0.0
    


    if (isFemale == true) {// female
      if (isNonSmoker == false) {// smoker
        if (age >= 40) {
          extraRate = 0.07 + 0.08; // female + smoker +age >=40
        } else {
          extraRate = 0.07 + 0.05; // female +smoker +age below 40
        }
      } else { // female + non-Smoker
        if (age >= 40) {// female + non-Smoker+age >= 40
          extraRate = 0.08;
        } else { // female + non-Smoker+age + age below 40
          extraRate = 0.05;
        }
      }
    } else { // male
      if (isNonSmoker == false) { // male + smoker
        if (age >= 70) {// male + smoker +age >=70
          extraRate = 0.07 + 0.15;
        } else {// male + smoker+age age below 70
          extraRate = 0.07;
        }
      } else { // non-Smoker
        if (age >= 70) { // non-Smoker + age >=70
          extraRate = 0.15;
        } else {// non-Smoker + age below 70
          extraRate = 0.0;
        }
      }
    }
    System.out.println("extraRate is " + extraRate);
    double totalPremium = basicFee * (1 + extraRate); // !點解要放在最底？因爲要先計current extraRate 係幾多先計到totalPremium.
    System.out.println("totalPremium is " + totalPremium);



  }
}
