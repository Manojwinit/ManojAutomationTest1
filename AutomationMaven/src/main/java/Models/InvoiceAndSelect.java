package Models;

public class InvoiceAndSelect {
	private String InvoiceNumber;
	private double TotalDueAmount;
	private double balanceamount;
	public InvoiceAndSelect(double totalDueAmount, double balanceamount) {
		super();
		TotalDueAmount = totalDueAmount;
		this.balanceamount = balanceamount;
	}
	public InvoiceAndSelect(String invoiceNumber, double totalDueAmount, double balanceamount) {
		InvoiceNumber = invoiceNumber;
		TotalDueAmount = totalDueAmount;
		this.balanceamount = balanceamount;
	}
}
