#Author: your.email@your.domain.com
@tag
Feature: BookingDotCom services

  @services
  Scenario: Verify the services
    Given user is on landing page
    When user dismisses popup
    Then user verifies stays
    And user closes browsers
   
    
