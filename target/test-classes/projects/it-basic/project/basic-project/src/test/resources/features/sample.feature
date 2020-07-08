@Sample
Feature: Google's Search Functionality

  Scenario: Can find search results
  	Given I am on Google search 'https://www.google.com/'
    When I type query as "independent verification & validation"
    Then I should see title "independent verification & validation - Google Search"