Feature: TopMenu Test
  as a user I want to check topmenu Tab

  Scenario: verifyUserShouldNavigateToDesktopsPageSuccessfully
    Given I am on Home page
    When Mouse hover on “Desktops” Tab and click
    And call selectMenu method and pass the menu = Show All Desktops
    Then Verify the text ‘Desktops’

  Scenario: verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully
    When Mouse hover on “Laptops & Notebooks” Tab and click
    And call selectMenu method and pass the menu = Show All Laptops & Notebooks
    Then Verify the text ‘Laptops & Notebooks’

  Scenario: verifyUserShouldNavigateToComponentsPageSuccessfully
    When Mouse hover on “Components” Tab and click
    And call selectMenu method and pass the menu = Show All Components
    Then Verify the text ‘Components’