@login
Feature: List of scenarios for login
Scenario Outline: login with valid data

Given open browser as "<browser>"
When enter url as "<url>"
When enter username as "<username>"
And enter password as "<password>"
When click login button
But dont click remember button
Then verify username as "<username>"

 Examples: 
|browser|url|username|password|username|
|chrome|sample url1| user1|pass123|vinoth|
|firefox|sample url2| user2|pass456|dinesh|
|safari|sample url3| user3|pass789|sai|
|ie|sample url4| user4|pass000|subbu|

