public class PersonalAccount extends Account {
  
  public PersonalAccount() {
    // super(); // implicitly calling Account() constructor
  }

  public static void main(String[] args) {
    PersonalAccount pa = new PersonalAccount();
    pa.getSavingAccount();
    pa.getCurrentAccount();
    pa.balance();

    Account acc1 = new PersonalAccount();
    System.out.println(acc1.getSavingAccount().getBalance()); //0.0
    acc1.getSavingAccount().credit(300);
    System.out.println(acc1.getSavingAccount().getBalance()); //300.0



  }
}