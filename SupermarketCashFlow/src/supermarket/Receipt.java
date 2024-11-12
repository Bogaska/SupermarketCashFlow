package supermarket;

public class Receipt {
    private String receiptId;
    private double totalAmount;

    public Receipt(String receiptId, double totalAmount) {
        this.receiptId = receiptId;
        this.totalAmount = totalAmount;
    }

    public String getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(String receiptId) {
        this.receiptId = receiptId;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
