public class InvalidPaymentTransferException extends Exception{
  
  public InvalidPaymentTransferException (){

  }

  public InvalidPaymentTransferException (String message){
    super(message);
  }

  try{

  }
  catch(InvalidPaymentTransferException e){
System.out.println("this is InvalidPaymentTransferException:"+ e.getMessage());
  }


public static void main(String[] args) {
double payable = 10000d;

  public boolean isValidPaymentProceed(double amount) throws InvalidPaymentTransferException{
if(amount ==null || amount<=payable){
throw new InvalidPaymentTransferException("Payment cannot be proceeded,insufficient fund");
return false;
}



}


}
