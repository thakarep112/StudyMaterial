Feature: To read data from JSON objects

  Scenario: Reading data from simple JSON object
    * def jsonResponse =
      """
      
      [
      {
          "id": 101,
          "name": "Sunita Patil",
          "email": "sunita@gmail.com",
          "gender": "female",
          "status": "active"
      },
      {
          "id": 102,
          "name": "Suresh Bhoir",
          "email": "suresh@gmail.com",
          "gender": "male",
          "status": "inactive"
      }
      ]

      """
    * print jsonResponse
    * print jsonResponse.length
    * print jsonResponse[0]
    * print jsonResponse[0].id
    * print jsonResponse[0].name
    * print jsonResponse[0].email
    * print jsonResponse[0].gender
    * print jsonResponse[0].status
    * print jsonResponse[1]
    * print jsonResponse[1].id
    * print jsonResponse[1].name
    * print jsonResponse[1].email
    * print jsonResponse[1].gender
    * print jsonResponse[1].status

  Scenario: Reading data from complex JSON object
    * def jsonResponse =
      """
      
      {
        "company": {
          "name": "Tech Innovations",
          "address": {
            "street": "123 Tech Lane",
            "city": "Silicon Valley",
            "state": "CA",
            "postal_code": "94043"
          },
          "employees": [
            {
              "id": 1,
              "name": "Alice",
              "position": "Software Engineer",
              "contact": {
                "email": "alice@techinnovations.com",
                "phone": "555-1234"
              }
            },
            {
              "id": 2,
              "name": "Bob",
              "position": "Data Scientist",
              "contact": {
                "email": "bob@techinnovations.com",
                "phone": "555-5678"
              }
            }
          ]
        }
      }

      """
    * print jsonResponse
    * print jsonResponse.company
    * print jsonResponse.company.name
    * print jsonResponse.company.address
    * print jsonResponse.company.address.street
    * print jsonResponse.company.address.city
    * print jsonResponse.company.address.state
    * print jsonResponse.company.address.postal_code
    * print jsonResponse.company.employees.length
    * print jsonResponse.company.employees
    * print jsonResponse.company.employees[0]
    * print jsonResponse.company.employees[0].id
    * print jsonResponse.company.employees[0].name
    * print jsonResponse.company.employees[0].position
    * print jsonResponse.company.employees[0].contact
    * print jsonResponse.company.employees[0].contact.email
    * print jsonResponse.company.employees[0].contact.phone
    * print jsonResponse.company.employees[1]
    * print jsonResponse.company.employees[1].id
    * print jsonResponse.company.employees[1].name
    * print jsonResponse.company.employees[1].position
    * print jsonResponse.company.employees[1].contact
    * print jsonResponse.company.employees[1].contact.email
    * print jsonResponse.company.employees[1].contact.phone
