Feature: Checkout Your Cart

  Scenario: Proceed with checkout
    When I click checkout
    Then I should be on Checkout Your Information page
    And I enter shipping information
    And I click continue
