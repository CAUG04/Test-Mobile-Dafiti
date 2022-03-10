Feature: Cart Operations

  Scenario: the user can create a new account, add a item and verify the item
    Given the user open the app Dafiti
    When the user create a new account
      | email             | password | documentType | id        | name   | lastName | birtDate   | gender    |
      | c.urreeegg@test.com | 123456*  | CC           | 10101010 | Carlos | Urrego   | 04/11/1990 | Masculino |
    And he adds the product to the cart with
    Then he should see the added product in the cart
