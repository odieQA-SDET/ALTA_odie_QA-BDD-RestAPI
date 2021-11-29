Feature: Login in features at demoqa.com
  As a customer at demoqa.com
  I want to see my profile
  So that I can see my username, userID and token

  Scenario: Login The Empty Username and Password
    Given I was on the Login page
    When I filled the empty username and Password
    And I clicked 'login' button in page
    Then Warning massage UserName and Password required and stay Sign in page



  Scenario: Login The Empty Password
    Given I was on the Login page
    When I filled my username correctly and the empty Password
    And I clicked 'login' button the empty Password
    Then Warning massage UserName and Password required and stay Sign in page



  Scenario: Login Successfully
    Given I was on the Login page
    When I filled my username and password correctly
    And I clicked 'login' button
    Then I was taken to the dashboard