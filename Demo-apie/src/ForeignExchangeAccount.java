public class ForeignExchangeAccount extends SubAccount {
  public ForeignExchangeAccount (){

  }
  public static void main(String[] args) {
    ForeignExchangeAccount fx = new ForeignExchangeAccount();
    System.out.println(fx.getBalance());

    fx.credit(100);
    System.out.println(fx.getBalance());

    

    }

  }

