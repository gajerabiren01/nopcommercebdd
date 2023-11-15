Feature: Hover

  @register
    Scenario: As a user When I hover over Computer option color of text should turn blue
    Given I am on nopcommerce homepage
    When hover to computer category option
    Then color of computer option turn blue