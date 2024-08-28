@gui
Feature: Validation login functionality

  Background:
    Given open login page

  @smoke
  Scenario: Successful login
    When login with correct username testrailaqa27@mail.ru and password Qwertyu_1
    Then dashboard page is displayed


  Scenario: login with incorrect password
    When set username "testrailaqa27@mail.ru"
    * set password "Qwertyu_2"
    * user clicks login button
    Then error message "Email/Login or Password is incorrect. Please try again." is displayed



  Scenario: login with incorrect username
    When set username "testrailaqa271@mail.ru"
    * set password "Qwertyu_1"
    * user clicks login button
    Then error message "Email/Login or Password is incorrect. Please try again." is displayed

