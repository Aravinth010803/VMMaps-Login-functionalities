Feature: Validation of VMmaps Web aplication of Login page

Scenario: validation of login page with valid Credintial

Given user Launch the VMmaps web application
When user enter valid EmailId and password
And click on login button
Then verify user able to view the VMmaps Home page

Scenario Outline: validation of Login page with and Invalid password

Given user Launch the VMmaps web application
When user enter valid "<EmailId>" and valid "<password>"
And click on login button 
Then user able to view the error message  

Examples:
|EmailId|password|
|akaravinthkrish07@gmail.com|Aravinth@321|
|aravinthkrish07@gmail.com|Aravinth@123|
|aravinthkrish07@gmail.com|Aravinth@321|

