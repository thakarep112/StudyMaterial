Feature: To verify POST API calls

  Scenario: POST API call - Passing request payload and creating the new user
    * def requestPayload =
      """
      {
          "name": "Ishita Kumar Bhalla",
          "email": "ishitakumar1bhalla@gmail.com",
          "gender": "female",
          "status": "active"
      }
      """
    Given url baseUrl + '/public/v2/users'
    And request requestPayload
    And header Authorization = 'Bearer ' + tokenID
    When method POST
    Then status 201
    * print response

  Scenario: POST API call - Creating the new user and validating response parameters
    * def requestPayload =
      """
      {
          "name": "Raman Kumar Bhalla",
          "email": "ramankumar1bhalla@gmail.com",
          "gender": "male",
          "status": "active"
      }
      """
    Given url baseUrl + '/public/v2/users'
    And request requestPayload
    And header Authorization = 'Bearer ' + tokenID
    When method POST
    Then status 201
    * print response
    * def responsePayload = response
    * def actualName = responsePayload.name
    * def actualEmail = responsePayload.email
    * def actualGender = responsePayload.gender
    * def actualStatus = responsePayload.status
    * match responsePayload.id == '#present'
    * match actualName == requestPayload.name
    * match actualEmail == requestPayload.email
    * match actualGender == requestPayload.gender
    * match actualStatus == requestPayload.status
