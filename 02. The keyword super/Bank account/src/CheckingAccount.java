public class CheckingAccount extends BankAccount {
    // write your code here
    protected double fee;

    public CheckingAccount(String number, Long balance, double fee) {
        super(number, balance);
        this.fee = fee;
    }
}
