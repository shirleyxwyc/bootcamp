public class Day5DemoifPremium10CaseIfElseIf {
  public static void main(String[] args) {
    boolean isFemale = true;
    boolean isSmoker = false;
    int age = 39;
    double extraRate = 0.0;
    double basePremium = 120.0;

    // base premium = 120

    // Female 40 or above, premium 8% more
    // Male 16 or above, premium 3% more
    // Famale or Male Smoker -> 7% more
    // Famale or Male Age 70 or above -> 20% more

    // 1. Female, <40, Non-Smoker 0%
    // 2. Female, <40, Smoker 7%
    // 3. Female, 40-69,Non-Smoker 8%
    // 4. Female, 40-69, Smoker 8% +7% =15%
    // 5. Female, ≥70,Non-Smoker 20%
    // 6. Female, ≥70, Smoker 20% +7% =27%
    // 7. Male, <16,Non-Smoker 0%
    // 8. Male, <16, Smoker 7%
    // 9. Male, 16-69,Non-Smoker 3%
    // 10.Male, 16-69, Smoker 3% +7% =10%
    // 11.Male, ≥70,Non-Smoker 20%
    // 12.Male, ≥70, Smoker 20% +7% =27%

    if (isFemale) {
      if (age < 40) {
        if (isSmoker) { // Female + age<40 + Smoker
          extraRate = 0.07;
        } else {
          extraRate = 0.0;// Female + age<40 + Non-Smoker
        }
      } else if (age >= 40 && age < 70) {
        if (isSmoker) {
          extraRate = 0.15;// Female + age >= 40 && age < 70 + Smoker
        } else {
          extraRate = 0.08; // Female + age >= 40 && age < 70 + Non-Smoker
        }
      } else if (age > 70) {
        if (isSmoker) {
          extraRate = 0.27;// Female + age > 70 + Smoker
        } else {
          extraRate = 0.2; // Female + age > 70 + Non-Smoker
        }
      }
    } else { // Male
      if(age<16) {
        if(isSmoker) {
          extraRate = 0.07; //Male + age <16 + Smoker
        }else {
          extraRate =0.0; //Male + age <16 + Non-Smoker
        }
      }else if (age >=16 && age <70) {
        if(isSmoker) {
          extraRate = 0.1; //Male + age >=16 && age <70 + Smoker
        } else {
          extraRate =0.03; //Male + age >=16 && age <70 + Non-Smoker
        }
      }else if (age>70) {
        if(isSmoker){
          extraRate = 0.27; //Male + age > 70 + Smoker
        } else {
          extraRate = 0.2; //Male + age > 70 + Non-Smoker
        }
      }
    }
System.out.println("The extraRate is "+extraRate);
double premium = basePremium * (1+extraRate);
System.out.println("The premium is " + premium);


  }
}
