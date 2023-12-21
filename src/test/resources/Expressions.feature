@expressions
Feature:
  This is a feature to demo cucumber expressions like {int} {string}
  Optional text like cucumber(s)
  Alternate text like stomach/belly .

  Rule:
  In this example
  1. I have a stomach and I have a belly matches the same step in MyStepDefs
  2. Similarly I eat 1 cucumber and I eat 2 cucumbers match same step

  Scenario:  Test
    Given I have a Stomach
    When I eat 1 cucumber
    Then I don't feel full
    When I eat 2 cucumbers and "three" tomatoes
    Then I feel full

  Scenario:  Test
    Given I have a Belly
    When I eat 2 cucumbers
    Then I don't feel full
    When I eat 2 cucumbers and "three" tomatoes
    Then I feel full
