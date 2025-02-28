package week2.day3.seleniumJava;

public class Chrome extends Browser
{
	public void openIncognito()
	 {
		 System.out.println("open Incognito");
	 }
	 public void clearCache()
	 {
		 System.out.println("Clear cache");
	 }

	public static void main(String[] args) {
		Chrome c=new Chrome();
		c.browserName="Chrome Browser";
		System.out.println(c.browserName);
		c.browserVersion="11.4.5";
		System.out.println(c.browserVersion);
		c.clearCache();
		c.openIncognito();
		c.openURL();
		c.navigateBack();
		c.closeBrowser();
		
	}

}
