Feature: Login as different user using Scenario Outline

  Scenario Outline:Login as different user using Scenario Outline
    Given The user is on the login page
    When The user logs in using "<username>" and "<password>"
    Then The user should be able to login
    Then The welcome message contains "<welcomeMessage>"
    Examples:
      | username            | password   | welcomeMessage     |
      | eurotech@gmail.com  | Test12345! | Welcome Teacher    |
      | jackbauer@gmail.com | Admin123   | Welcome Jack Bauer |
      | emrah@gmail.com     | emrah12345 | Welcome Emrah      |
      | 123456@gmail.com    | 123456     | Welcome Burak      |
      | nhntsc@gmail.com    | N12345!    | Welcome Nihan      |
