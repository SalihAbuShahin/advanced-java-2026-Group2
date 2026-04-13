public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) throws NegativeAmountException{
        if(amount < 0){
            String str = "NegativeAmountException, can not deposit negative amount";
            throw new NegativeAmountException(str);
        }
        else{
            balance = balance+amount;

        }
    }

    public void withdraw(double amount) throws NegativeAmountException, InsufficientFundsException{
        if(amount<0){
            String str = "NegativeAmountException, can not withdraw negative amount";
            throw new NegativeAmountException(str);
        }
        else{
            if(amount> balance){
                String str = "InsufficientFundsException, not enough balance";
                throw new InsufficientFundsException(str);
            }else{
                balance = balance - amount;
            }
        }

    }

    public double getBalance() {
        return balance;
    }

}
