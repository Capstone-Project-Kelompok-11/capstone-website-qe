Feature: Admin be able to see homepage
  As admin
  I want to login
  So that I can see my homepage

  @login
  Scenario: As admin, I have be able to login
    Given I am on the landing page
    When I click sign in
    And I fill email field
    And I fill password field
    And I click login button
    Then I am on the homepage

  @login-wrong-email
  Scenario: As admin, I can't login because wrong email
    Given I am on the landing page wrong email
    When I click sign in wrong email
    And I fill email field with wrong email
    And I fill password field wrong email
    And I click login button wrong email
    Then I see failed login message wrong email

  @login-wrong-password
  Scenario: As admin, I can't login because wrong password
    Given I am on the landing page wrong password
    When I click sign in wrong password
    And I fill email field wrong password
    And I fill password field with wrong password
    And I click login button wrong password
    Then I see failed login message wrong password