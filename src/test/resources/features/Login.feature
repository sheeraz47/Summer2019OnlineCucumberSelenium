Feature: Login
  As user, I want to be able to login into vytrack
  under different roles with username and password

  #  Any step that was implemented before, can be reused
#  If test step has yellow background, tat means it doesn't have implementation yet
#  click command/ctrl + option/alt + L to organize code, save like in java
#  I had somewhere from 2 to 25 scenarios in every feature file
#  By passing parameters/strings in "some word" we can reuse test steps
#  In my project, I was trying to keep scenarios short
  @store_manager
  Scenario: Login as store manager
    Given user is on the login page
    Then user logs in as store manager
    And user verifies that "Dashboard" page subtitle is displayed


  @driver
  Scenario: Login as driver
    Given user is on the login page
    Then user logs in as driver
    And user verifies that "Dashboard" page subtitle is displayed

  @sales_manager
  Scenario: Login as sales manager
    Given user is on the login page
    Then user logs in as sales manager
    And user verifies that "Dashboard" page subtitle is displayed

  @negative_test
  Scenario: Verify that warning message is displayed when password is not correct
    Given user is on the login page
    Then user enters "storemanager85" usernamne and "wrong" password
    And user verifies that "Invalid user name or password." message is displayed

  @negative_test
  Scenario: Verify that warning message is displayed when username is not correct
    Given user is on the login page
    Then user enters "wrong_user" usernamne and "UserUser123" password
    And user verifies that "Invalid user name or password." message is displayed

  @driver_with_data_table
  Scenario: Login as driver(data table example}
    Given user is on the login page
    Then user logs in as driver with following credentials
      | username | user160     |
      | password | UserUser123 |
    And user verifies that "Quick Launchpad" page subtitle is displayed

  @login_with_role
  Scenario: Login as driver
    Given user is on the login page
    Then user logs in as "driver"

  @login_with_role
  Scenario: Login as sales manager
    Given user is on the login page
    Then user logs in as "sales manager"

  @login_with_role
  Scenario: Login as store manager
    Given user is on the login page
    Then user logs in as "store manager"

    # merge the above three method with scenario outline
  @login_with_role_ddt
  Scenario Outline:DDT example, Login as <role>
    Given user is on the login page
    Then user logs in as "<role>"

    Examples: roles
      | role          |
      | driver        |
      | sales manager |
      | store manager |

  @login_with_credentials_ddt
  Scenario Outline: DDT example with credentials, login as <username>
    Given user is on the login page
    Then user enters "<username>" usernamne and "<password>" password

    Examples:
      |  username     | password    |
      | storemanager  | UserUser123 |
      | salesmanager  | UserUser123 |
      | user160       | UserUser123 |