package supermarket;

public class Invoice {
    private String invoiceNumber;
    private double totalAmount;

    public Invoice(String invoiceNumber, double totalAmount) {
        this.invoiceNumber = invoiceNumber;
        this.totalAmount = totalAmount;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
