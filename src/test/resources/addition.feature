Feature: addition of two numbers

 Scenario Outline: add two integers
    Given user enters a <num1> and taps plus and enters another <num2>
    When equals selected
    Then result is <total>

   Examples:
   |num1|num2|total|
   |1   |2   |3    |
   |2   |2   |4    |
