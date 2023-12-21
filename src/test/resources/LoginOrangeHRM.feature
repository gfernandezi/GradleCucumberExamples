#Feature: This is test to login OrangeHRM Site
#
#  Scenario: Scenario to Login to site of OrangeHRM
#    Given I navigate to OrangeHRM site
#    When I enter the user "Admin" and password "Admin123"
#    Then I log in the site

Feature: Login to HRM Application
  @ValidCredentials
  Scenario: Login with valid credentials

    Given User is on HRMLogin page "https://opensource-demo.orangehrmlive.com/"
    When User enters username as "Admin" and password as "admin123"
    Then User should be able to login successfully and new page open