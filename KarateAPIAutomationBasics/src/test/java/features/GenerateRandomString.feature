Feature: To verify POST API calls with random String

  Background: 
    * url baseUrl + '/public/v2/users'
    * def randomString =
      """
      function(s){
      var text = "";
      var pattern = "abcdefghijklmnopqrstuvwxyz";
      for(var i=0; i<s; i++){
      text +=  pattern.charAt(Math.floor(Math.random()* pattern.length()))
      }
      return text;
      }
      """
    * def randomEmailString = randomString(10);
    * print randomEmailString
    * def requestPayload =
      """
      {
          "name": "Raman Kumar Bhalla",
          "gender": "male",
          "status": "active"
      }
      """
    * requestPayload.email = randomEmailString + "@gmail.com"
    * print requestPayload

  Scenario: Generating random string for request payload email address and creating the new user using POST API call.
    Given request requestPayload
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
