Feature: To verify GET API calls

  # Basic Example
  Scenario: Get API call - Fetching all the user details
    Given url baseUrl + '/public/v2/users'
    When method GET
    Then status 200
    * print response

  # Path Parameter Example
  Scenario: Get API call - Passing Path Parameters
    Given url baseUrl + '/public/v2/users'
    And path '7919925'
    When method GET
    Then status 200
    * print response

  # Query Parameter Example
  Scenario: Get API call - Passing Query Parameters
    * def queryParameters = {status:'active', gender:'male'}
    Given url baseUrl + '/public/v2/users'
    And params queryParameters
    When method GET
    Then status 200
    * def userDetails = response
    * print userDetails
    * def userCount = userDetails.length
    * print userCount
    * match userCount == 10

  # Response Data Validation Examples
  Scenario: Get API call - Validating user details - Approach1
    Given url baseUrl + '/public/v2/users'
    And path '7919925'
    When method GET
    Then status 200
    * print response
    And def userDetails = response
    And def actualId = userDetails.id
    And def actualName = userDetails.name
    And def actualEmail = userDetails.email
    And def actualGender = userDetails.gender
    And def actualStatus = userDetails.status
    * match actualId == 7919925
    * match actualName == 'Miss Jagdish Nayar'
    * match actualEmail == 'miss_jagdish_nayar@reinger.test'
    * match actualGender == 'male'
    * match actualStatus == 'active'

  Scenario: Get API call - Validating user details - Approach2
    Given url baseUrl + '/public/v2/users'
    And path '7919935'
    When method GET
    Then status 200
    * print response
    And def userDetails = response
    And def actualId = $.id
    And def actualName = $.name
    And def actualEmail = $.email
    And def actualGender = $.gender
    And def actualStatus = $.status
    * match actualId == 7919935
    * match actualName == 'Meena Abbott Jr.'
    * match actualEmail == 'jr_abbott_meena@jast.example'
    * match actualGender == 'male'
    * match actualStatus == 'inactive'

  # Request Headers Examples
  Scenario: Get API call - Passing Request Headers - Approach1
    Given header User-Agent = 'PostmanRuntime/7.43.4'
    And header Accept-Encoding = 'gzip, deflate, br'
    And header Connection = 'keep-alive'
    When url baseUrl + '/public/v2/users'
    And path '7912111'
    When method GET
    Then status 200
    * print response

  Scenario: Get API call - Passing Request Headers - Approach2
    * def requestHeaders = {User-Agent: 'PostmanRuntime/7.43.4', Accept-Encoding: 'gzip, deflate, br', Connection: 'keep-alive'}
    Given headers requestHeaders
    When url baseUrl + '/public/v2/users'
    And path '7912111'
    When method GET
    Then status 200
    * print response

  Scenario: Get API call - Passing Request Headers - Approach3
    * configure headers = {User-Agent: 'PostmanRuntime/7.43.4', Accept-Encoding: 'gzip, deflate, br', Connection: 'keep-alive'}
    Given url baseUrl + '/public/v2/users'
    And path '7912111'
    When method GET
    Then status 200
    * print response
