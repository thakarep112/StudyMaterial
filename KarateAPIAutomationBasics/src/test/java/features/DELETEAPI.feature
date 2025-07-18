Feature: Delete user details by using DELETE API call

  Scenario: Create new user and delete user details using DELETE API call
    #1. Creating new user to perform delete operation
    Given url baseUrl + '/public/v2/users'
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
    * def postRequestPayload =
      """
      {
          "name": "Raman Bhalla",
          "gender": "male",
          "status": "active"
      }
      """
    * postRequestPayload.email = randomEmailString + "@gmail.com"
    And request postRequestPayload
    And header Authorization = 'Bearer ' + tokenID
    When method POST
    Then status 201
    * print response
    * def postResponseJson = response
    * match postResponseJson.id == '#present'
    #2. Retrieving userID from POST call response to use it further in DELETE call
    * def userID = postResponseJson.id
    #3. Deleting user details by using DELETE call
    Given url baseUrl + '/public/v2/users/' + userID
    And header Authorization = 'Bearer ' + tokenID
    When method DELETE
    Then status 204
    #4. Trying to fetch deleted user details by using GET call
    Given url baseUrl + '/public/v2/users/' + userID
    When method GET
    Then status 404
    * def getResponseJson = response
    * match getResponseJson.message == 'Resource not found'
