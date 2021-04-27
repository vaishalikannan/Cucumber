#Author: your.vaishali@your.domain.com
@tag
Feature: Add Tariffplan
  I want to use this template for my feature file

  @tag1
  Scenario: Validate add tariff plan module
    Given user launches telecom application
    And user click on add tariff pan button
    When user need to fill up the fields
    And user click on submit button
    Then user verify tariff plan is generated

  Scenario: Validate add tariff plan module
    Given user launches telecom application
    And user click on add tariff pan button
    When user need to fill up the fields by one dim list
      | 2000 | 22 | 23 | 24 | 25 | 26 | 27 |
    And user click on submit button
    Then user verify tariff plan is generated

  Scenario: Validate add tariff plan module
    Given user launches telecom application
    And user click on add tariff pan button
    When user need to fill up the fields by one dim Map
      | R  | 12 |
      | LM | 13 |
      | IM | 14 |
      | SP | 15 |
      | MC | 16 |
      | IC | 17 |
      | Sc | 18 |
    And user click on submit button
    Then user verify tariff plan is generated

  Scenario: Validate add tariff plan module
    Given user launches telecom application
    And user click on add tariff pan button
    When user need to fill up the fields by Two dim list
      | 2000 | 22 | 23 | 24 | 25 | 26 | 27 |
      | 2000 | 22 | 23 | 24 | 25 | 26 | 27 |
      | 2000 | 22 | 23 | 24 | 25 | 26 | 27 |
    And user click on submit button
    Then user verify tariff plan is generated

  Scenario: Validate add tariff plan module
    Given user launches telecom application
    And user click on add tariff pan button
    When user need to fill up the fields by Two dim Map
      | R    | LM | IM | SP | LC | IC | SC |
      | 2000 | 22 | 23 | 24 | 25 | 26 | 27 |
      | 2000 | 22 | 23 | 24 | 25 | 26 | 27 |
      | 2000 | 22 | 23 | 24 | 25 | 26 | 27 |
    And user click on submit button
    Then user verify tariff plan is generated
