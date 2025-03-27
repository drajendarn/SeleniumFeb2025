package week6.day3.extentreports;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtentReports {
	public static void main(String[] args) {

		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("yyyy-MM-dd-HH_mm_ss");
		String format = ofPattern.format(now);
		String folderPath = System.getProperty("user.dir");// to get the project folder
System.out.println(folderPath);
		// Setup physical report path
		
		//ExtentHtmlReporter reporter = new ExtentHtmlReporter("./report/result.html");// without timpstamp
		ExtentHtmlReporter reporter = new ExtentHtmlReporter(folderPath+"/report/"+format+"result.html");

		//reporter.setAppendExisting(true);// we can use this when we use same file name to keep the history
		// Create extent report Object
		ExtentReports reports = new ExtentReports();

		// Attach data with physical report
		reports.attachReporter(reporter);
		// create testcase and assign test details
		ExtentTest test = reports.createTest("Leaftap_login", "Authentication of user credentials");
		test.assignAuthor("Divya"); // Test author
		test.assignCategory("Regression testcase"); // Test category

		// Add Test logs - PASS/FAIL
		test.pass("User name entered successfully"); // To add step level steps -PASS
		//to take screenshot at step level
		//test.pass(message,MediaEntityBuilder.createScreenCaptureFromPath(folderPath+"/Snapshot/Amazon.png").build());
		test.fail("Password not entered successfully"); // To add step level steps -FAIL
		test.fail("Login Failed"); // To add step level steps -FAIL
		reports.flush(); // Report will be genearted after flush
		
	}

}
