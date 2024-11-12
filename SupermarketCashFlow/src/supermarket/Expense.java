package supermarket;

public class Expense {
    private double expenseAmount;

    public Expense(double expenseAmount) {
        this.expenseAmount = expenseAmount;
    }

    public double getExpenseAmount() {
        return expenseAmount;
    }

    public void setExpenseAmount(double expenseAmount) {
        this.expenseAmount = expenseAmount;
    }
}
