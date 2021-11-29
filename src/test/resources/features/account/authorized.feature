Feature: Authorized Customer in features demoqa.com
  As a Customer at demoqa.com
  I want to see my Account
  So that i can authorized my account was true or false

  Scenario: Authorized account the empty Username and Password
    Given I was on the Authorized page
    When I filled the empty username and Password of author
    And I clicked 'execute' button the page
    Then Warning massage UserName and Password required and stay in Authorized page


  Scenario: Authorized account the empty Password but Username correctly
    Given I was on the Authorized page
    When I filled the empty Password but Username correctly
    And I clicked 'execute' button the system
    Then Warning massage UserName and Password required and stay in Authorized page


  Scenario: Authorized account is successfully
    Given I was on the Authorized page
    When I filled my username and Password is correctly
    And I clicked 'execute' button carefully
    Then I was taken the new page of Authorized
