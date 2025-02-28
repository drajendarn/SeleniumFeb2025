package week2.day3.seleniumJava;

public class InherLoginTestData extends  InherTestData{

	
	public void enterUsername()
	{
		System.out.println("Method inside LoginTestdata base class-enterUsername");
	}
	
	public void enterPassword()
	{
		System.out.println("Method inside LoginTestdata base class-enterPassword");
	}
	public static void main(String[] args) {
		
		InherLoginTestData I=new InherLoginTestData();
		I.enterCredentials();
		I.navigateToHomePage();
		I.enterPassword();
		I.enterUsername();
	}
}
