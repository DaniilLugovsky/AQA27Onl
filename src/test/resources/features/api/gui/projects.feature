@gui
Feature: Validation login functionality

  Background:
    Given open login page
    When login with correct username testrailaqa27@mail.ru and password Qwertyu_1

  Scenario: Check Add Project Page
    When user clicks add project button
    Then add project page is displayed