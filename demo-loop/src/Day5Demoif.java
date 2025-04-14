public class Day5Demoif {
  public static void main(String[] args) {
       // if, else if, else
       int x = 9;

       // 1. if + else if + else
       if (x < 10) {
         System.out.println("x < 10"); // ! print
       } else if (x < 15) {
         System.out.println("x < 15"); // not print
       } else if (x >= 20) {
         System.out.println("x >= 20"); // not print
       } else { // 10 - 19
         System.out.println("10 - 19"); // not print
       }
   
       // 2. if
   
       // 3. if + else
   
       // 4. if + else if
       String s = "goodbye";
       if (s.equals("hello")) {
         System.out.println("this is hello");
       } else if (s.equals("Hello")) {
         System.out.println("this is Hello");
       }
   
       boolean isFemale = false;
       boolean isSmoker = true;
       int age = 15;
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
        if(age>=70) {
          extraRate += 0.2;
        } else if (age >=40) {
          extraRate += 0.08;
        }
    }else { //Male
        if(age>=70) {
          extraRate += 0.2;
        } else if (age >=16) {
          extraRate += 0.03;
        }
      }
    if(isSmoker) {
          extraRate += 0.07;
        }
       
       System.out.println("extraRate is "+extraRate);
       double premium = basePremium * (1+extraRate);
       System.out.println("Premium is " + premium);





  }
}
