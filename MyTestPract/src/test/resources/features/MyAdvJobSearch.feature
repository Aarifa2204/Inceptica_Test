Feature: A/B Functionality validations

  Scenario Outline: Navigate to the OneMail Page and validate the A_B_Testing
    Given user navigate to the oneMail App and login with "<UserName>" and "<PassWord>"
    When user clicks on Setup Side menu and navigates to the Demograhics page
    Then Verify the user is able to view the Create Demo Button
    Then Verify the user is able to logout and close the browser

    Examples: 
      | UserName | PassWord  |
      | admin    | Rainb0wz1 |
