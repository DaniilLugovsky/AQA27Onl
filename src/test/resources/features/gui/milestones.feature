@gui
Feature: CRUD tests for Milestones (With parameterization)

  Background:
    Given open login page
    When login with correct username testrailaqa27@mail.ru and password Qwertyu_1

  Scenario: Creation Milestones
    Given dashboard page is displayed
    When user clicks on project
    Then project page is displayed
    When user click on button add Milestones
    Given Milestones Add Page is displayed
    When Send name "name"
    * Send References "References"
    ##* Send Parent "Parent"
    * Send Description "Description"
    * Click Start Date
    When Click Add Milestones


