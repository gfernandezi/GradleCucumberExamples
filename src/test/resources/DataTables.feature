Feature: This is a feature to demo different types of data tables

  Scenario: Scenario to demo datatable.aslist()
    Given the following animals:
      | cow   |
      | horse |
      | sheep |

  Scenario: scenario to demo datatable.values()
    Given these animals:
      | cow | horse | sheep |


  Scenario: scenario to demo datatable.row
    Given these rows of animals:
      | cow | horse    | sheep |
      | dog | elephant | goat  |

  Scenario: scenario to demo datatable.List of list of string
    Given these rows of animals list of list
      | cow | horse    | sheep |
      | dog | elephant | goat  |

  Scenario: scenario to demo datatable.asMap
    Given these credentials
      | UserName | Password |
      | Ravi     | Gajul    |
      | Rakesh   | Roshan   |