Feature: addition of two numbers
  Scenario: add two integers
    Given user enters a number and taps plus and enters another number
    When equals selected
    Then result is 10
