import java.time.DayOfWeek;
import java.time.LocalDate;

public class DemoDate {
  public static void main(String[] args) {
    // 2025 4 17
    // For date value, we should not use int variable for storage
    // because it is hard to perform operation on 'date', i.e. comparison ? add day?

    LocalDate today = LocalDate.of(2025, 4, 17);
    System.out.println(today); // return String "2025-04-17"
    LocalDate day2 = today.plusDays(14);
    System.out.println(day2); // "2025-05-01"

    LocalDate day3 = today.plusMonths(2);
    System.out.println(day3);

    LocalDate day4 = today.plusWeeks(50);
    System.out.println(day4); // "2026-04-02"

    LocalDate day5 = today.minusDays(90);
    
    //isAfter-->boolean-->use if
    if (today.isAfter(LocalDate.of(2025, 4, 16))) {
      System.out.println("today>2024.4.16");
    }
    //isAfter-->boolean-->use if ， if left > right?
    if(today.isBefore(LocalDate.of(2026, 1, 1))) {
      System.out.println("today<2026.1.1");//today<2026.1.1
    }
    if(today.isEqual(LocalDate.of(2025,4,17))) {
      System.out.println("today is 2025.4.17"); //today is 2025.4.17
    }
    System.out.println(today.isLeapYear()); //false
    System.out.println(LocalDate.of(2100, 1, 1).isLeapYear());//false

    
    //System.out.println();
    DayOfWeek dow =LocalDate.of(2026,1,1).getDayOfWeek();
    System.out.println("day of week of 2026.1.1 is " + dow);
    System.out.println(dow.toString());

    DayOfWeek dow2 = DayOfWeek.of(3);
    System.out.println(dow2); //WEDNESDAY

    System.out.println(LocalDate.now());//2025-04-17
    //how about skipping particular public holiday when calculating working days
    













  }

}
