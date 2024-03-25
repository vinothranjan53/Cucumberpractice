@amazon
Feature: List of scenarios for login

@login @smoke
Scenario: validate login page with valid data
Given login with valid data
@login
Scenario: validate login page with invalid data
Given login with invalid data
@login
Scenario: validate login page with empty data
Given login with empty data

@search @smoke
Scenario: search the required product in the searchbar
Given search the required product

@description
Scenario: validate the product specifications in the description
Given check the description

@addtocart @smoke
Scenario: validate the add to cart funtionality by adding the product to it
Given check the add to cart funtion

@payment @smoke
Scenario: validate the payment funtionality
Given check the payment funtion

@info
Scenario: validate the mail and message verification funtionality
Given check the mail and message



