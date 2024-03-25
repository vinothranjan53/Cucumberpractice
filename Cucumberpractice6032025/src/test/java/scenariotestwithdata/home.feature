@login
Feature: user login in login page

Scenario: login with valid details


Given open browser as "chrome"
When enter url as "sample url"
When enter username as "sample username"
And enter password as "pass123"
But dont click remember button
Then verify welcome page as "user"

