@Azeem1
Feature: CVLibrary job SearchPage Validations

  Scenario Outline: Perform the normal job search With Parameters KeyWord, Location and Distance as 25 miles
    #Given user navigate to the CVLibrary Application and Verify the pagetitle "<Title>"
    When user Enter the search data "<JobTitle>", "<Location>", "<Distance>"  and click on Find Jobs Button
    Then Verify the user is able to view the Search Result in the Results page
    Then Verify the the page title is "<Title2>"

    Examples: 
      | JobTitle      | Location     | Distance       | Title2                       |
      | Test Engineer | Teston, Kent | up to 25 miles | Test Engineer jobs in Teston |


@Azeem
  Scenario Outline: Perform the normal job search With Parameters MoreSearchOptions
   #Given user navigate to the CVLibrary Application and Verify the pagetitle "<Title>"
    When user Enter the search data "<JobTitle>", "<Location>", "<Distance>" and clicks on the More Search Options Link
    Then the user pass the  values in the respective fields "<MinSal>" , "<MaxSal>" ,"<SalTyp>", "<JobTyp>"
    Then Verify the user is able to view the Search Result in the Results page
    Then Verify the the page title is "<Title2>"

    Examples: 
      | JobTitle      | Location     | Distance       | MinSal | MaxSal | SalTyp    | JobTyp    | Title2                       | 
      | Test Engineer | Teston, Kent | up to 25 miles |   3000 |   4000 | Per month | Permanent | Permanent Test Engineer jobs in Teston | 