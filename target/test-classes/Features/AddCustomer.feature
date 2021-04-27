#Author: your.vaishali@your.domain.com
@tag
Feature: Add customer
  I want to use this template for my feature file

  @tag1
  Scenario: Validate add customer module
    Given User launches telecom applicatiom
    And user click on add customer button
    When user need to fill up the fields in add customer window
    And user click on submit button in add customer window
    Then user verify customer id is generated

  Scenario: Validate add customer module
    Given User launches telecom applicatiom
    And user click on add customer button
    When user need to fill up the fields in add customer window by one dim list
      | vaishali | vinoth | vaishalithangamk@gamil.com | Nil | 9965817517 |
    And user click on submit button in add customer window
    Then user verify customer id is generated

  Scenario: Validate add customer module
    Given User launches telecom applicatiom
    And user click on add customer button
    When user need to fill up the fields in add customer window by one dim Map
      | fname   | vaishali                   |
      | lname   | vinoth                     |
      | email   | vaishalithangamk@gamil.com |
      | address | Nil                        |
      | phno    |                 9965817517 |
    And user click on submit button in add customer window
    Then user verify customer id is generated

  Scenario: Validate add customer module
    Given User launches telecom applicatiom
    And user click on add customer button
    When user need to fill up the fields in add customer window by two dim list
      | vaishali | vinoth   | vaishalithangamk@gamil.com | Nil | 9965817517 |
      | kannan   | bharathi | bharathik@gamil.com        | Nil | 9965817517 |
      | vignesh  | vinoth   | vaishalithangamk@gamil.com | Nil | 9965817517 |
    And user click on submit button in add customer window
    Then user verify customer id is generated

  Scenario: Validate add customer module
    Given User launches telecom applicatiom
    And user click on add customer button
    When user need to fill up the fields in add customer window by two dim Map
      | FirstName | LastName | MailID                     | Add | Phno       |
      | vaishali  | vinoth   | vaishalithangamk@gamil.com | Nil | 9965817517 |
      | kannan    | bharathi | bharathik@gamil.com        | Nil | 9965817517 |
      | vignesh   | vinoth   | vaishalithangamk@gamil.com | Nil | 9965817517 |
    And user click on submit button in add customer window
    Then user verify customer id is generated
