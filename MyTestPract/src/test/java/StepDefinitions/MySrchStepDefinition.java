package StepDefinitions;

import org.openqa.selenium.NoSuchElementException;

import MyPages.MySearch;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MySrchStepDefinition
{
	@Given("user navigate to the CVLibrary Application and Verify the pagetitle {string}")
	public void userNavigateToTheCVLibraryApplicationAndVerifyThePagetitle(String pageTitle) throws InterruptedException 
	{
		MySearch.MyNrmlJobsearch(pageTitle);
	}
	@When("user Enter the search data {string}, {string}, {string}  and click on Find Jobs Button")
	public void userEnterTheSearchDataAndClickOnFindJobsButton(String jbtitle, String Loc, String Dist) throws InterruptedException  
	{
	   try 
	   {
		MySearch.MyNrmlJobsearchDetailsPassing(jbtitle, Loc, Dist);
	   } 
	   catch (NoSuchElementException e) 
	   {
		e.printStackTrace();
	   }
	   
	}
	@Then("Verify the user is able to view the Search Result in the Results page")
	public void verifyTheUserIsAbleToViewTheSearchResultInTheResultsPage() throws InterruptedException 
	{
		try 
		{
			MySearch.MyNrmlJobsearchResults();
		} 
		catch (NoSuchElementException e) 
		{
			e.printStackTrace();
		}
			  
	}
	@Then("Verify the the page title is {string}")
	public void verifyTheThePageTitleIs(String Title2) throws InterruptedException 
	{
		try 
		{
			MySearch.MyNrmlJobsearchPgTitle(Title2);
		} 
		catch (NoSuchElementException e) 
		{
			e.printStackTrace();
		}
	}
	
	
	@When("user Enter the search data {string}, {string}, {string} and clicks on the More Search Options Link")
	public void userEnterTheSearchDataAndClicksOnTheMoreSearchOptionsLink(String jbtitle, String Loc, String Dist) throws InterruptedException 
	{
		try 
		{
			MySearch.JobsearchDetailsPassing(jbtitle,Loc,Dist);
		} catch (NoSuchElementException e) 
		{
			e.printStackTrace();
		}
	}
	
	@Then("the user pass the  values in the respective fields {string} , {string} ,{string}, {string}")
	public void theUserPassTheValuesInTheRespectiveFields(String MinSal, String MaxSal, String SalTyp, String JobTyp) throws InterruptedException 
	{
		try {
			MySearch.AdvJobsearchDetailsPassing(MinSal,MaxSal,SalTyp,JobTyp );
		} catch (NoSuchElementException e) 
		{
			e.printStackTrace();
		}
	}

}
