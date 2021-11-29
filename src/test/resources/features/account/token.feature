Feature: Generate Token in features at demoqa.com
  As a customer at demoqa.com
  I want to see Token Customer
  So that i can taken Token my account

  Scenario: Generate Token account the Empty Username and Password
    Given I was on the Token page
    When I filled my Password is Empty
    When I clicked 'execute' in Token Page
    Then I was stay in Token page



  Scenario: Generate Token account the Empty Password
    Given I was on the Token page
    When I filled username correctly and Password is empty
    When I clicked 'execute' the empty Pass
    Then Warning massage UserName and Password required and stay Sign in page



  Scenario: Generate Token account is successfully
    Given I was on the Token page
    When I filled username and password correctly
    And I clicked 'execute' button carefully and fun
    Then I was taken to New Dashboard
