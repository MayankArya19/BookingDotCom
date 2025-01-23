#Author: your.email@your.domain.com

@LoginFeature
Feature: Login
  @Sanity @Login
  Scenario: Login With Correct Credentials
    Given user is on landing page
    When user dismisses popup
    And user clicks sign in
    When user enters username
    Then user closes browser


  @Sanity @Login
  Scenario: Login1 With Correct Credentials
    Given user is on landing page
    When user dismisses popup
    And user clicks sign in
    When user enters username
    Then user closes browser
    