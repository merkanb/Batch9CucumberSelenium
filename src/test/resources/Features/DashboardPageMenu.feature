Feature: Dashboard menu page

  Scenario: user should be able to see Dashboard menu after login
    Given The user is on the login page
    When The user logs in using "eurotech@gmail.com" and "Test12345!"
#    preceding statement is defined as Doc Strings in Gherkin lang. - corresponding Strings,
#    https://cucumber.io/docs/gherkin/reference/?sbsearch=gherkin%2Freference
    Then The user should be able to login
    Then The user should be able to see following menu
      | Developers |
      | All Posts  |
      | My Account |


  @wip
  Scenario: user should be able to see Dashboard menu after login
    Given The user is on the login page
#    When The user logs in using "eurotech@gmail.com" and "Test12345!"      // dublication for login func.
    When The user logs in using following credentials
      | username | eurotech@gmail.com |
      | password | Test12345!         |
#    preceding statement is defined as Data Tables in Gherkin lang. - corresponding Map Data Structure
    Then The user should be able to login
    Then The user should be able to see following menu
      | Developers |
      | All Posts  |
      | My Account |
#    preceding statement is defined as Data Tables in Gherkin lang. - corresponding List Data Structure
