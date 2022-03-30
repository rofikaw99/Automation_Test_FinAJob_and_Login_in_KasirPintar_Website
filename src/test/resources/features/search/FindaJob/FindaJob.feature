Feature:Login
  As a user
  I want to perform find a job QA Automation Engineer
  so that I can see the job feed

  @findcareer
  Scenario: find career
    Given I open career page
    When I input a job "QA Automation Engineer"
    When I click cari button
    Then I can see my job


