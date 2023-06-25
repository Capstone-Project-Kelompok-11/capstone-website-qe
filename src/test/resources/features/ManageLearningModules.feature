Feature: Admin be able to manage learning modules
  As admin
  I want to manage learning modules
  So that I can manage my modules

  @create-chapter
  Scenario: As admin, I have be able to create chapter
    Given I am on the login page to create chapter
    When I login to create chapter
    And I am on the home page to create chapter
    And I click course to create chapter
    And I click on view course button
    And I click + button
    And I fill the chapter data form
    Then I click upload to create chapter