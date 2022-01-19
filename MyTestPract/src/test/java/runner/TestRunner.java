package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;

import MyPages.MySearch;

@RunWith(Cucumber.class)
@CucumberOptions (
		features = "src/test/resources/features/MyjobSearch.feature",
		glue = {"StepDefinitions"},
		snippets = SnippetType.CAMELCASE,
		plugin = {"html:target/reports/cucumber-report.html",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		
		//dryRun = true,
		tags = "@Azeem"
		
		)


public class TestRunner extends MySearch
{
	@BeforeClass
	public static void beforeExecution() 
	{
		System.setProperty("webdriver.chrome.driver","D:\\MyPractice\\Drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.cv-library.co.uk");	
		
	}	
}
