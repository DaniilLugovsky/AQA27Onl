Feature: Параметризированные тесты

  Scenario: Параметризаия шагов (степов)
    Given открыт браузер
    * страница логина открыта
    When user "atrostyanko@gmail.com" with password "Qwertyu_1" log in
    Then page title is All Projects
    And project ID is 123
    And project ID equal to 123
    And project ID is "123"
    * all elements are not visible
    * all elements "are" visible

  Scenario Outline: параметризация с использованием таблицы значений
    Given открыт браузер
    * страница логина открыта
    When user "<username>" with password "<password>" log in
    Then project ID is <projectID>

    Examples:
      | username              | password  | projectID |
      | atrostyanko@gmail.com | Qwertyu_1 | 123       |
      | atrostyanko@gmail.com | Qwertyu_1 | 124       |
      | atrostyanko@gmail.com | Qwertyu_1 | 125       |

  Scenario: Параметризация шага с большим колличеством даных
    Given открыт браузер
    * страница логина открыта
    When user logged in with
      | username | atrostyanko@gmail.com |
      | password | Qwertyu_1             |
      | age      | 46                    |
      | sex      | M                     |
    Then page title is All Progects
    Then project ID is 123

  Scenario: Параметризация шага с большим колличеством даных в одном шаге
    Given открыт браузер
    * страница логина открыта
    When user logged in with 1
      | username              | password  | age | sex |
      | atrostyanko@gmail.com | Qwertyu_1 | 46  | M   |
      | atrostyanko@gmail.com | Qwertyu_2 | 23  | F   |
    Then page title is All Progects
    Then project ID is 123