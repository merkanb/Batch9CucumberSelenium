@navigateMenu
Feature: Navigate to menu with parameters

  Background:
    Given The user is on the login page
    When The user logs in using "eurotech@gmail.com" and "Test12345!"
    Then The welcome message contains "Welcome Teacher"

  Scenario: User navigate to Developers Menu
    And The user navigates to "All Posts" menu
    Then The user should be able to see header as "Posts"

  Scenario: User navigate to My Account Menu
    And The user navigates to "My Account" menu
    Then The user should be able to see header as "Dashboard"

  @new
  Scenario Outline: User navigate to each Menus
    And The user navigates to "<menuName>" menu
    Then The user should be able to see header as "<header>"
    Examples:
      | menuName   | header     |
      | All Posts  | Posts      |
      | My Account | Dashboard |

