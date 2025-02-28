package week2.day3.seleniumJava;

public class PolicymorphismLoginPage extends PolicymorphismBasePage {
	
	@Override
	public void performCommonTasks()
	{
		System.out.println("performCommonTasks method overrided in subcalss ");
	}

	public static void main(String[] args) {
		
		PolicymorphismLoginPage obj=new PolicymorphismLoginPage();
		obj.clickElement();
		obj.enterText();
		obj.findElement();
		obj.performCommonTasks();
	}

}
