public class BankMain {
    public static void main(String[] args) {
        BankAccount b = new BankAccount(0);
    try {
        //b.withdraw(150);
        b.deposit(2500);
        System.out.println(b.getBalance());
        b.deposit(1500);
        System.out.println(b.getBalance());

        b.withdraw(10000);
    }
    catch(InsufficientFundsException e){
        e.printStackTrace();
        }

    catch(NegativeAmountException e){
        e.printStackTrace();
    }
    catch(Exception e){
        e.printStackTrace();
    }
    }
}
