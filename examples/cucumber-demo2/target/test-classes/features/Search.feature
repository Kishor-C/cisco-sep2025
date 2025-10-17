Feature: Google Search Functionality

Scenario: User can search for a term on Google
    Given I am on the Google homepage
    When I search for "Cucumber"
    Then I should see search results for "Cucumber"