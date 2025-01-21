#Author: your.email@your.domain.com

@tag
Feature: Login
  @tag1
  Scenario: Login With Correct Credentials
    Given user is on landing page
    When user dismisses popup
    And user clicks sign in
    Then user closes browser
