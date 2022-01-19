package MyPages;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MySearch 
{
	protected static WebDriver driver;
	
	public static String cvLib_keywrd = "keywords";  //used id Locator
	public static String cvLib_SearchElmnt = "//*[contains(text(),'Search jobs in your area')]";
	public static String cvLib_loc = "location";	//used id Locator
	public static String cvLib_dis = "distance";	//used id Locator
	public static String cvLib_srchBtn = "hp-search-btn";	//used id Locator
	public static String cvLib_MrScrhLnk = "toggle-hp-search";    //used Xpath Locator
	public static String cvLib_SalMin = "salarymin";	//used id Locator
	public static String cvLib_SalMax = "salarymax";	//used id Locator
	public static String cvLib_SalTyp = "salarytype";	//used id Locator
	public static String cvLib_JbTyp = "tempperm";	//used id Locator
	public static String cvLib_NoJob = "//*[contains (text(), '0 jobs found.')]";  //used Xpath Locator
	public static String cvLib_SrchRslt = "//*[@class='search-header__results']";	//used id Locator
	public static String cvLib_CntryHdr = "//*[@class='search-header__title']/h1";	//used id Locator
	//public static String cvLib_AdvSrchBtn = "hp-search-btn";	//used id Locator
	public static String cvLib_JobsCount = "//*[@class='strapline']/h1[2]/a";
	
	
	
	
	public static void MyNrmlJobsearch(String Title) throws InterruptedException 
		{
		
		if(driver.findElement(By.id(cvLib_keywrd)).isDisplayed())
		    {
		    	String PgTitle = driver.getTitle();
		    	System.out.println(PgTitle);
		    	System.out.println(Title);
		    	Assert.assertEquals(PgTitle, Title);
		    }
		}
	
	public static void MyNrmlJobsearchDetailsPassing(String jbtitle, String Loc, String Dist) throws InterruptedException 
	{
		if(driver.findElement(By.id(cvLib_keywrd)).isDisplayed())
	    {
			driver.findElement(By.id(cvLib_keywrd)).sendKeys(jbtitle);
	    }
		
		if(driver.findElement(By.id(cvLib_loc)).isDisplayed())
	    {
			driver.findElement(By.id(cvLib_loc)).sendKeys(Loc);
	    }
		
		if(driver.findElement(By.id(cvLib_dis)).isDisplayed())
	    {
			Select drpDist = new Select(driver.findElement(By.id(cvLib_dis)));
			drpDist.selectByVisibleText(Dist);
	    }
		
		if(driver.findElement(By.id(cvLib_srchBtn)).isDisplayed())
	    {
			driver.findElement(By.id(cvLib_srchBtn)).click();
	    }
	}
	
	public static void MyNrmlJobsearchResults() throws InterruptedException 
	{
	
		if(driver.findElement(By.xpath(cvLib_SrchRslt)).isDisplayed())
	    {
			WebDriverWait wait = new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(cvLib_SrchRslt)));
			
			System.out.println(driver.findElement(By.xpath(cvLib_SrchRslt)).getText());
			
		}
	}
	
	public static void MyNrmlJobsearchPgTitle(String title2) throws InterruptedException 
	{
		if(driver.findElement(By.xpath(cvLib_SrchRslt)).isDisplayed())
	    {
			String PgTitle = driver.getTitle();
			System.out.println(PgTitle);
	    	if(PgTitle.contains(title2))
	    	{
	    		System.out.println("The search result is successfull");
	    		
	    	}
	    }
	}
	
	
	public static void JobsearchDetailsPassing(String jbtitle, String Loc, String Dist) throws InterruptedException 
	{
		
		if(driver.findElement(By.id(cvLib_MrScrhLnk)).isDisplayed())
	    {
			driver.findElement(By.id(cvLib_MrScrhLnk)).click();
	    }
		
		if(driver.findElement(By.id(cvLib_keywrd)).isDisplayed())
	    {
			driver.findElement(By.id(cvLib_keywrd)).sendKeys(jbtitle);
	    }
		
		if(driver.findElement(By.id(cvLib_loc)).isDisplayed())
	    {
			driver.findElement(By.id(cvLib_loc)).sendKeys(Loc);
	    }
		
		if(driver.findElement(By.id(cvLib_dis)).isDisplayed())
	    {
			Select drpDist = new Select(driver.findElement(By.id(cvLib_dis)));
			drpDist.selectByVisibleText(Dist);
	    }
		Thread.sleep(3000);
		
	}
	
	public static void AdvJobsearchDetailsPassing(String MinSal, String MaxSal, String SalTyp, String JobTyp) throws InterruptedException 
	{
			
		if(driver.findElement(By.id(cvLib_SalMin)).isDisplayed())
	    {
			driver.findElement(By.id(cvLib_SalMin)).sendKeys(MinSal);
	    }
		
		if(driver.findElement(By.id(cvLib_SalMax)).isDisplayed())
	    {
			driver.findElement(By.id(cvLib_SalMax)).sendKeys(MaxSal);
	    }
		
		if(driver.findElement(By.id(cvLib_SalTyp)).isDisplayed())
	    {
			Select drpDist = new Select(driver.findElement(By.id(cvLib_SalTyp)));
			drpDist.selectByVisibleText(SalTyp);
	    }
		
		if(driver.findElement(By.id(cvLib_JbTyp)).isDisplayed())
	    {
			Select drpDist = new Select(driver.findElement(By.id(cvLib_JbTyp)));
			drpDist.selectByVisibleText(JobTyp);
	    }
		
		if(driver.findElement(By.id(cvLib_srchBtn)).isDisplayed())
	    {
			driver.findElement(By.id(cvLib_srchBtn)).click();
	    }
		
	}

	}