@login
Feature: user login in login page

Scenario: login with valid details


Given open browser
When enter url
When enter username
And enter password
But dont click remember button
Then verify welcome page

