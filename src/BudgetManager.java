public class BudgetManager {
    protected double balance;
    protected double monthlyLimit;
    protected double OriginalMonthlyLimit;


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getMonthlyLimit() {
        return monthlyLimit;
    }

    public void setMonthlyLimit(double monthlyLimit) {
        this.monthlyLimit = monthlyLimit;
    }

    public double getOriginalMonthlyLimit() {
        return OriginalMonthlyLimit;
    }

    public void setOriginalMonthlyLimit(double originalMonthlyLimit) {
        this.OriginalMonthlyLimit = originalMonthlyLimit;
        this.monthlyLimit = originalMonthlyLimit;
    }

    public void resetLimit() {
        this.monthlyLimit = this.OriginalMonthlyLimit;
    }
}
