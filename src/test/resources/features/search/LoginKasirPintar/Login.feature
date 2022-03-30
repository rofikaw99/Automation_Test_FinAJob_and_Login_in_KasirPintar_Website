Feature:Login in Kasir Pintar

  @loginKasirPintar
  Scenario: login success
    Given I open kasir pintar login page
    When user login as owner
    When I input email batiktrimulyo@gmail.com and password Rofik1999 in Kasir Pintar
    When I click button masuk kasir pintar
    Then I can see kasir pintar dashbord
