@login
Feature: user login in login page

Scenario: login with valid details


Given open browser as "chrome"
When enter url as "https://djangovinoth.pythonanywhere.com/login/"
When enter username as "vinothranjan"
And enter password as "coolvino"
And click login
But dont click remember button
Then verify welcome page as "vinothranjan"

