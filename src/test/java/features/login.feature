Feature: Application Login

    Scenario: OrangeHrm Login
      Given User in home page
      When User login into application with "Admin" and "admin"
      Then Dashboard page displayed "true"
      And User profile should be displayed
      | John| john@gmail.com | USA | 123 456
      | smith | Engineer | Java | Selenium

  Scenario: OrangeHrm Login
    Given User in home page
    When User login into application with "Test12" and "test123"
    Then Dashboard page displayed "false"
    And Invalid credential message should be displayed

