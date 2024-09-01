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
    * Send Description "Description"
    * Send Start Date "9/05/2024"
    * Send End Date "9/10/2024"
    * CLick CheckBox This milestone is completed "true"
    When Click Add Milestones
    Given Milestones Page is displayed
    And Message Success is displayed

  Scenario: Read Milestones
    Given dashboard page is displayed
    When user clicks on project
    Given project page is displayed
    When user clicks on top milestones list button
    Given Milestones Page is displayed
    When user clicks on personal Milestones button
    Given Milestones personal Page is displayed
    When user clicks on edit Milestones button
    Given Milestones edit Page is displayed
    * Read input Name
    * Read input References
    * Read input Description
    * Read input Start Date
    * Read input End Date
    * Read CheckBox


  Scenario: Update Milestones
    Given dashboard page is displayed
    When user clicks on project
    Given project page is displayed
    When user clicks on top milestones list button
    Given Milestones Page is displayed
    When user clicks on personal Milestones button
    Given Milestones personal Page is displayed
    When user clicks on edit Milestones button
    Given Milestones edit Page is displayed
    * Update Input Name "Jo"
    * Update Input References "Refrends"
    * Update Input Description "SOuSOuSOu"
    * Update input Start Date "9/10/2024"
    * Update input End Date "9/15/2024"
    * Update CheckBox "false"
    When Click Save Milestones
    Given Milestones Page is displayed
    And Message Success update is displayed

  Scenario: Delete Milestones
    Given dashboard page is displayed
    When user clicks on project
    Given project page is displayed
    When user clicks on top milestones list button
    Given Milestones Page is displayed
    When user clicks on personal Milestones update button
    Given Milestones personal Page is displayed
    When user clicks on edit Milestones button
    Given Milestones edit Page is displayed
    When user clicks on button delete Milestone
    Given Milestones Page is displayed
    And Message Successfully deleted the milestone is displayed