// Account, SubAccount

// PersonalAccount & CommericalAccount
// Saving & Current

import java.math.BigDecimal;

public abstract class Account { // login
  // private double balance; //should be calculate by method
  private SubAccount[] subAccounts; // saving, stock, fx


  // Personal


  public Account() { //SavingAccount & CurrentAccount.java 需要先extends Account再写以下，否则complile error
    this.subAccounts = new SubAccount[2]; // can not new abstract SubAccount but able to new SubAccount Array
    this.subAccounts[0] = new SavingAccount(); // ! New Concept--> new SavingAccount() and CurrentAccount()
    this.subAccounts[1] = new CurrentAccount();
    // 写死左.SubAccounts array only has a lenght of 2 and only consists of Saving ac and Current Account
  }
public PersonalAccount getSavingAccount() {
  return this.subAccounts[0];
}
  public SubAccount getSavingAccount() {
    return this.subAccounts[0];
  }

  public SubAccount getCurrentAccount() {
    return this.subAccounts[1];
  }

  // public abstract double totalValue();

  public double balance() {
    // loop subAccount array to sum up balance
    BigDecimal bd = new BigDecimal(0.0);
    for (int i = 0; i < this.subAccounts.length; i++) {
      bd = bd.add(BigDecimal.valueOf(this.subAccounts[i].getBalance()));
    }
    return bd.doubleValue();
  }



  public static void main(String[] args) {
    //Poly
    Animal animal = new Cat("John", 12);
    animal = new Dog("Susan");

    //Cat cat = new Animal("Peter"); // NOT OK
  }

}
