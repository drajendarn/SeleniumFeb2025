package week2.day3.seleniumJava;

public class Safari extends Browser{
	public void readerMode()
	 {
		 System.out.println("readerMode");
	 }
	 public void fullScreenMode()
	 {
		 System.out.println("fullScreenMode");
	 }
	public static void main(String[] args) {
		Safari s= new Safari();
		s.browserName="Safari Browser";
		System.out.println(s.browserName);
		s.browserVersion="11.4.5";
		System.out.println(s.browserVersion);
		s.openURL();
		s.readerMode();
		s.fullScreenMode();
		s.closeBrowser();
		s.navigateBack();

	}

}
