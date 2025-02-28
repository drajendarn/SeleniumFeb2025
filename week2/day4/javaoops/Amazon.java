package week2.day4.javaoops;

public class Amazon extends CanaraBankAbstarct {
	public void cashOnDelivery() {
		System.out.println("Implementing interface method-cashOnDelivery");
	}
	public void upiPayments() {
		System.out.println("Implementing interface method-upiPayments");
	}
	public void cardPayments() {
		System.out.println("Implementing interface method-cardPayments");
	}
	public void internetBanking() {
		System.out.println("Implementing interface method- internetBanking");
	}
	public void recordPaymentDetails() {
		System.out.println("Implementing abstract class method - recordPaymentDetails");
	}
	public static void main(String[] args) {
		Amazon a = new Amazon();
		a.cashOnDelivery();
		a.cardPayments();
		a.upiPayments();
		a.internetBanking();
		a.recordPaymentDetails();

	}

}
