import java.time.LocalDate;

// ! Builder pattern->return this(self,ie,builder's address)->new Builder to User
// ! *****the main advantage of Builder pattern:*****
// ! ***this constructor is hard to new when there are so many attributes***
public class User {
  private String userid;
  private String email;
  private LocalDate joinDate;

  // ! *****the main advantage of Builder pattern:*****
  // ! ***this constructor is hard to new when there are so many attributes***
  // public User(String userid,String email,LocalDate joinDate){
  // his.userid=userid;
  // this.email=email;
  // this.joinDate=joinDate;
  // }

  
  public static Builder builder() {
    return new Builder();
  }

  // Encapsulation(public to private)
  // private User(Builder builder){
  // this.userid=userid;
  // this.email=email;
  // this.joinDate=joinDate;
  // }
  private User(Builder builder) {
    this.userid = builder.userid;
    this.email = builder.email;
    this.joinDate = builder.joinDate;
  }


//! Class Builder is a static Nested Class of outter class User
//Bulider class has same attributes as Outter Class and 
// all attribute setters returning Builder itself
  public static class Builder {
    private String userid;
    private String email;
    private LocalDate joinDate;

    // special setter =return this(self)-continus setter
    public Builder userid(String userid) {
      this.userid = userid;
      return this;
    }

    public Builder email(String email) {
      this.email = email;
      return this;
    }

    public Builder joinDate(LocalDate joinDate) {
      this.joinDate = joinDate;
      return this;
    }

    // return user and produce user-> return user
    public User build() {// write user constructor => replace to
      return new User(this);
    }

    //Getters
    public String getUserid(){
      return this.userid;
    }

     public String getEmail(){
      return this.email;
    }

    public User joinDate(){
      return this.joinDate;
    }



  }
  public static void main(String[] args) {
    // User user = new User(xxx, xxx, xxx);
    User user = User.builder() //
        .userid("john") //
        .email("john@gmail.com") //
        .joinDate(LocalDate.of(2025, 2, 20)) //
        .build();

    User user2 = User.builder() //
        .email("john@gmail.com") //
        .build();

    //User user3 =
        //new User("vincentlau", "vincent@gmail.com", LocalDate.of(2020, 1, 2));
  }

  }




