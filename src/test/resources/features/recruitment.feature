Feature: Recruitment process

  As a recruitment manager,
  I want to add new candidates to the recruitment system and mark them as hired,
  So that I can efficiently track the hiring process and keep candidate information up to date.

  Scenario: Successfully adding and hiring a new candidate
    Given the recruitment manager is on the login page
    When they log in with valid credentials
      | username | password |
      | Admin    | admin123 |
    And they navigate to the Recruitment section
    And they add a new candidate with valid details
      | firstName | middleName | lastName | email               | contactNumber |
      | Jose      | Camilo     | Ricardo  | jrviloria@gmail.com | 3017988174    |
    And they finish the complete the hiring process
    Then they should see the candidate is hired