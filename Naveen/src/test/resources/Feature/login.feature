
Feature:  user has to check the adaactin webpage
@Login
Scenario: user has to check functonality of login page
Given  user has to go to login page
When user has to give input in username
And user has to give input in password
Then  user want to click login button

@DataTable
Scenario: user want to knoe login function
Given user has to login the page
When user has to pass below username and password
|ganeshRko1 | Gmilgmil12 |
Then click login button

@DataTableHeader
Scenario: user navigate to login page
Given user want to login the adactin page
When  user has to give below credentials
|username| password|
|ganeshRko1 | Gmilgmil12 |
Then click the login button

@ScenarioOutline1
Scenario: user want to check adactin page
Given user go to login page
When user want to pass "<username>" and "<password>"
Then click login 

Examples:
|username| password|
|ganeshRko1 | Gmilgmil12 |
|Naveen| naveen|

@regularexpression
Scenario: check student bio
Given Student name is "Naveen"
And  Student roll number is 12345
And Student cgpa is 7.34



