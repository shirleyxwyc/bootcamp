import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DemoForEach {

  public static void main(String[] args) {
   // List<User>
    // forEach
    List<User> users = new ArrayList<>();
    User user1 = User.builder().userid("johnwong").email("john@gmail.com")
        .joinDate(LocalDate.of(2024, 10, 24)).build();

     User user2 = User.builder().userid("johnwong").email("john@gmail.com")
        .joinDate(LocalDate.of(2024, 10, 24)).build();

        users.add(user1);

        users.forEach(u->{
          System.out.println("User: " + u.getUserid()+","+u.getEmail()+ ","+u.getJoinDate());
        });

 
  }
}
