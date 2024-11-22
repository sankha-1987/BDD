#Author: Sankhadeep Pujaru

Feature: Login to Swag Labs Application

  Scenario: Login to App with valid credentials
  
    Given I want to launch the browser
    And Load the URL
    When Login Page is displayed enter username and password
    And Click on Login button
    Then Check if Home Page is displayed