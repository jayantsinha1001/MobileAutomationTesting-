@test
Feature: Login scenarios for rampsure

  Scenario Outline: Login With Invalid User Name
    When click on Allow
    When enter username as "<username>"
    And  enter password as "<password>"
    And  Click On login
    Then login should fail with an error message " Invalid Username or Password"
    Examples:
      | username | password |
      | insignia.pvet3 | 989 |

  Scenario Outline: successful u    ser login with valid credentials
    When enter username as "<username>"
    And enter password as "<password>"
    And Click On login
#    Then user should click on close button of update popup
    Then user should be loggedIn with profile name "<profile_name>"
    And user should be able to logout
    Examples:.
      | username         |  password | profile_name   |
      | insignia.pvet3   |   987     | insignia pvet3 |
