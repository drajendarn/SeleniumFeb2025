package week2.day3.seleniumJava;

public class Edge extends Browser {
	public void takeSnap()
	 {
		 System.out.println("takeSnap");
	 }
	 public void clearCookies()
	 {
		 System.out.println("clearCookies");
	 }
	public static void main(String[] args) {
		Edge e= new Edge();
		e.browserName="Edge Browser";
		System.out.println(e.browserName);
		e.browserVersion="11.4.5";
		System.out.println(e.browserVersion);
		e.openURL();
		e.clearCookies();
		e.takeSnap();
		e.clearCookies();
		e.navigateBack();
		e.closeBrowser();
	}

}
