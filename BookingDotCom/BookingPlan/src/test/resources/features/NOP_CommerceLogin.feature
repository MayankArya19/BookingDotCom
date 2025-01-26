#Author: your.email@your.domain.com

@tag
Feature: NOP Commerce Demo Login Feature

  @tag1
  Scenario: Login as Admin
    Given user is on landings page
    And user enter username
    And user enters password
    When user clicks on login
    Then user can see dashboard

