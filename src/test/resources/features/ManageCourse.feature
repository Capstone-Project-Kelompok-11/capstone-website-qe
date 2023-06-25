Feature: Admin be able to manage course
  As admin
  I want to manage course
  So that I can manage my courses

  @create-course
  Scenario: As admin, I have be able to create course
    Given I am on the login page to create course
    When I login to create course
    And I am on the home page to create course
    And I click course to create course
    And I click on new course button
    And I fill the course data form
    Then I click upload

  @update-course
  Scenario: As admin, I have be able to update course
    Given I am on the login page to update course
    When I login to update course
    And I am on the home page to update course
    And I click course to update course
    And I click on three dot on the course
    And I click update to update course
    And I change the course data form
    Then I click update