Scenario: User creating the account
Given:User is trying to create the account in system.
When: He gives name as Sagar Kulkarni and Amount as 300
Then: System should create the account successfully

Given:User is trying to create the account in system.
When: He gives name as Sagar Kulkarni and Amount as 50
Then: System should generate error message as the "Amount should be greater than or equal to 100."

Given:User is trying to create the account in System
When: He passes "null" as user name
Then: System should generate error message as "Please give valid user name."

Scenario: User is getting his account balance
Given: User is trying to retrieve balance of his account
When: He gives account number 
And: System finds the account with that number
Then: System should return the account details

Given: User is trying to retrieve balance of his account
When: He gives account number 
And: System does not find the account with that number
Then: System should generate error.