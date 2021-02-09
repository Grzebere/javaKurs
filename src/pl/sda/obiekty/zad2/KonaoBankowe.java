package pl.sda.obiekty.zad2;

public class KonaoBankowe {
    private long accountNumber;
    private int accountaBalance;

    public int getAccountaBalance() {
        return accountaBalance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void displayAccountBalance() {
        System.out.println(accountaBalance);
    }

    public void makeDeposit(int amount) {
        this.accountaBalance += amount;
    }

    public int withdrawMoney(int amount) {
        this.accountaBalance -= amount;
        return amount;
    }

    public KonaoBankowe(long accountNumber, int accountaBalance) {
        this.accountNumber = accountNumber;
        this.accountaBalance = accountaBalance;
    }

    public void sendMoney(KonaoBankowe sender, KonaoBankowe reciver, int amount) {
        sender.withdrawMoney(amount);
        reciver.makeDeposit(amount);
    }


}
