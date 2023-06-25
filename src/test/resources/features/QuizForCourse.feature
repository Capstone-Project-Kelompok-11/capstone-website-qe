Feature: Admin be able to manage quiz
  As admin
  I want to manage quiz
  So that I can manage my quiz for course

  @create-quiz
  Scenario: As admin, I have be able to create quiz
    Given I am on the login page to create quiz
    When I login to create quiz
    And I am on the home page to create quiz
    And I click course to create quiz
    And I click on view course button to create quiz
    And I click on quiz button
    And I fill the quiz soal and jawaban
    Then I click submit

  @edit-quiz
  Scenario: As admin, I have be able to edit quiz
    Given I am on the login page to edit quiz
    When I login to edit quiz
    And I am on the home page to edit quiz
    And I click course to edit quiz
    And I click on view course button to edit quiz
    And I click on quiz button to edit quiz
    And I edit the quiz soal and jawaban
    Then I click update to edit quiz