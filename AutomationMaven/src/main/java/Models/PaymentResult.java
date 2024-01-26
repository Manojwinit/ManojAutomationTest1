package Models;

public class PaymentResult {
    private String paymentMode;
    private double totalPaidAmount;

    public PaymentResult(String paymentMode, double totalPaidAmount) {
        this.paymentMode = paymentMode;
        this.totalPaidAmount = totalPaidAmount;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public void setTotalPaidAmount(double totalPaidAmount) {
		this.totalPaidAmount = totalPaidAmount;
	}

	public double getTotalPaidAmount() {
        return totalPaidAmount;
    }
}