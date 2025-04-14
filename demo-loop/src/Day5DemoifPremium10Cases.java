public class Day5DemoifPremium10Cases {
  public static void main(String[] args) {
    boolean isFemale = false;
    boolean isSmoker = true;
    int age = 15;
    double extraRate = 0.0;
    double basePremium =120;

    // base premium = 120
   
    // Female 40 or above, premium 8% more
    // Male 16 or above, premium 3% more
    // Famale or Male Smoker -> 7% more
    // Famale or Male Age 70 or above -> 20% more
   
    //1. Female, <40, Non-Smoker 	0%
    //2. Female, <40, Smoker 	7%
    //3. Female, 40-69,Non-Smoker 	8%
    //4. Female, 40-69, Smoker 	8% +7% =15%
    //5. Female, ≥70,Non-Smoker 	20%
    //6. Female, ≥70, Smoker 	20% +7% =27%
    //7. Male, <16,Non-Smoker 	0%
    //8. Male, <16, Smoker 	7%
    //9. Male, 16-69,Non-Smoker 	3%
    //10.Male, 16-69, Smoker 	3% +7% =10%
    //11.Male, ≥70,Non-Smoker 	20%
    //12.Male, ≥70, Smoker 	20% +7% =27%

       if(isFemale) {
        if(age<40){
          if(isSmoker) {//Female + age <40 + Smoker →7%
            extraRate = 0.07;
          } else {//Female + age <40 + Non-Smoker →0%
            extraRate = 0.0;
          }
        } else { //Female + age >= 40 && age < 70 + Smoker →15%
          if(age >= 40 && age < 70) {
            if(isSmoker) {
              extraRate = 0.15;
            } else { //Female + age >= 40 && age < 70 + Non-Smoker →8%
              extraRate = 0.08;
            } 
          } else {
          if (age >=70) {
            if (isSmoker) {
              extraRate = 0.27; //Female + age > 70 + Smoker
            } else {
              extraRate = 0.2;//Female + age > 70 + Non-Smoker
            }
          }
        }
      }
    } else {//male
      if(age<16) {
        if(isSmoker){
          extraRate = 0.07; //male + < 16 + Smoker
        } else {
          extraRate = 0.0; //male + < 16 + Non-Smoker
          }
      } else {
        if(age >=16 && age<70) {
          if(isSmoker) {
            extraRate = 0.1;//male + age >=16 && age<70 + Smoker
          } else {
            extraRate = 0.03;//male + age >=16 && age<70 + Non-Smoker
          }
      } else {//male + age>=70 + Non-Smoker
           if(isSmoker) {
            extraRate = 0.27; //male + age>=70 +Smoker
          } else {
            extraRate = 0.2;//male + age>=70 + Non-Smoker
          }
        }
      }
    } 
System.out.println(extraRate);
double premium = basePremium * (1+extraRate);
System.out.println(premium);




  }
}
