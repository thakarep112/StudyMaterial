Feature: Update user details by using PATCH API call

  Scenario: Create new user and update user details using PATCH API call
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
    * print postRequestPayload
    And request postRequestPayload
    And header Authorization = 'Bearer ' + tokenID
    When method POST
    Then status 201
    * print response
    * def postResponseJson = response
    * match postResponseJson.id == '#present'
    #2. Retrieving userID from POST call response to use it further in PUT call
    * def userID = postResponseJson.id
    #3. Updating user details by using PATCH call
    Given url baseUrl + '/public/v2/users/' + userID
    * def patchRequestPayload =
      """
      {
          "name": "Raman Kumar Bhalla",
          "gender": "male",
          "status": "active"
      }
      """
    * set patchRequestPayload.email = postRequestPayload.email
    * set patchRequestPayload.id = userID
    * print patchRequestPayload
    And request patchRequestPayload
    And header Authorization = 'Bearer ' + tokenID
    When method PATCH
    Then status 200
    * print response
    * def patchResponseJson = response
    * match patchResponseJson.id == '#present'
    * match patchResponseJson.id == patchRequestPayload.id
    * match patchResponseJson.name == patchRequestPayload.name
    * match patchResponseJson.status == patchRequestPayload.status
    * match patchResponseJson.gender == patchRequestPayload.gender
    * match patchResponseJson.email == patchRequestPayload.email
