Feature: Admin be able to see report
  As admin
  I want to see report
  So that I can see customer report

  @reporting
  Scenario: As admin, I have be able to see report
    Given I am on the login page to see report
    When I login to see report
    And I am on the home page to see report
    And I click reporting tab
    And I click on course
    And I click on customer
    Then I see customer report
