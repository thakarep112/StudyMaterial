Feature: Update user details by using PUT API call

  Scenario: Create new user and update user details using PUT API call
    #1. Creating new user to perform update operation
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
    * def postResponsePayload = response
    * match postResponsePayload.id == '#present'
    #2. Retrieving userID from POST call response to use it further in PUT call
    * def userID = postResponsePayload.id
    #3. Updating user details by using PUT call
    Given url baseUrl + '/public/v2/users/' + userID
    * def putRequestPayload =
      """
      {
          "name": "Raman Kumar Bhalla",
          "status": "inactive"
      }
      """
    And request putRequestPayload
    And header Authorization = 'Bearer ' + tokenID
    When method PUT
    Then status 200
    * print response
    * def putResponsePayload = response
    * match putResponsePayload.id == '#present'
    * match putResponsePayload.id == userID
    * match putResponsePayload.name == putRequestPayload.name
    * match putResponsePayload.status == putRequestPayload.status
    * match putResponsePayload.email == postRequestPayload.email
