#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

#Outline for parameterisized

Feature: Login into Application

Scenario Outline: Positive test validating login
Given Initialize browser with chrome
And Navigate to "https://www.flipkart.com/" site
And Click on login button in index page
When user enters <username> and <password>
Then verify user is successfully logged in
And close browser


Examples:
|username                |password    |
|username@example.com    |password123 |
|test@abc.com            |testpassword|

