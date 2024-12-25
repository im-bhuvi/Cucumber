Feature: To validate Facebook functionality 

Scenario: To validate login page with invalid credentials
Given The user should be in facebook login page
When the user have to enter the username and password
     | bhuviss | 11234 |#1 dimensional without header
     
And agin The user have to enter user and pass
     |bhuvanesh|1234556|#2 dimensional without header
     |vicky    |bhiooi | 
     |ysuf     |1000   | 
     
Then agin the user have to enter the username and password
     |username|hari|#1 dimensional with header
     |password|1235|
     
And agin user have to enter the username and password  maps
     |username|password|
     |bhuvi|0900|#2 dimensional with header
     |vicky|0000|
     |karthi|0000|

