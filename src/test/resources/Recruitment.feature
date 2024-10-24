#language: en

  Feature:  Recruitment process
    As an HR user
    I want to log in to the OrangeHRM system and add a candidate
    So that I can validate that the candidate is hired successfully
  Scenario: Successfully log in and add a new candidate
    Given I am on the OrangeHRM login page https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
    When I log in with the credentials
    |login | password |
    |Admin |admin123  |
    Then I should be redirected to the dashboard
    When I navigate to the Recruitment section
    And I click on the  Add button
    And I fill in the candidate details
    And I submit the candidate information
    Then I should see the candidate listed
    When I select the candidate
    #And I mark the candidate as Hired
    Then the status of the candidate should be Hired