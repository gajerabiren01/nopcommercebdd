Feature: Register

  @register
  Scenario: As a user, I should able to register successfully
    Given I am on NopEcommerce Homepage
    When I click on Register button
    And I enter all required registration details
    Then I should be able to register successfully