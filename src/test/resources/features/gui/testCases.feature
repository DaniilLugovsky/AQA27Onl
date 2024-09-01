@gui
Feature: CRUD tests for TestCases (With table)

  Background:
    Given open login page
    When login with correct username testrailaqa27@mail.ru and password Qwertyu_1

  Scenario Outline: Creation TestCases
    Given dashboard page is displayed
    When user clicks on project
    Then project page is displayed
    When user clicks on top TestCases list button
    Given TestCases Page is displayed
    When user clicks on add TestCases Button
    Given AddTestCases Page is displayed
    When Send Title <title>
    * Send Section <section>
    * Send Template <template>
    * Send Type <type>
    * Send Priority <priority>
    * Send Assigned To <assigned>
    * Send Estimate <estimate>
    * Send Test Case References <references>
    * Send Automation Type <type1>
    * Send Preconditions <preconditions>
    * Send Steps <steps>
    * Send Expected Result <result>
    When user clicks on button add test case
    Then message Add Test Case is displayed
    Examples:
      | title   | section      | template           | type            | priority | assigned              | estimate | references   | type1     | preconditions   | steps   | result            |
      | "Title" | "Test Cases" | "Test Case (Text)" | "Accessibility" | "Low"    | "Viachaslau Savianok" | "1h 40m" | "References" | "Ranorex" | "Preconditions" | "Steps" | "Expected Result" |

  Scenario: Read Test Case
    Given dashboard page is displayed
    When user clicks on project
    Then project page is displayed
    When user clicks on top TestCases list button
    Given TestCases Page is displayed
    When user clicks on personal Test Case
    Given Personal Test Case Page is displayed
    When user clicks on edit Test Case button
    Given Edit Test Case Page is displayed
    * Read All info

  Scenario Outline: Update Test Case
    Given dashboard page is displayed
    When user clicks on project
    Then project page is displayed
    When user clicks on top TestCases list button
    Given TestCases Page is displayed
    When user clicks on personal Test Case
    Given Personal Test Case Page is displayed
    When user clicks on edit Test Case button
    Given Edit Test Case Page is displayed
    * Update Title <title>
    * Update Section <section>
    * Update Template <template>
    * Update Type <type>
    * Update Priority <priority>
    * Update Assigned To <assigned>
    * Update Estimate <estimate>
    * Update Test Case References <references>
    * Update Automation Type <type1>
    * Update Preconditions <preconditions>
    * Update Steps <steps>
    * Update Expected Result <result>
    When user clicks on button save test case
    Then message Update Test Case is displayed
    Examples:
      | title    | section      | template           | type          | priority   | assigned | estimate | references      | type1  | preconditions      | steps      | result                |
      | "Tuutle" | "Test Cases" | "Test Case (Text)" | "Performance" | "Critical" | "None"   | "2h 50m" | "ReferencesTwo" | "None" | "PreconditionsTwo" | "StepsTwo" | "Expected Result Two" |

    Scenario: Delete Test Case
      Given dashboard page is displayed
      When user clicks on project
      Then project page is displayed
      When user clicks on top TestCases list button
      Given TestCases Page is displayed
      When user clicks on personal update Test Case
      Given Personal Test Case Page is displayed
      When user clicks on edit Test Case button
      Given Edit Test Case Page is displayed
      When user clicks on delete Test Case button
      Then Message Delete Test Case is displayed