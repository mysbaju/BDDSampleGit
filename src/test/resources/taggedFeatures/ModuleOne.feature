@E2E1
Feature: CRM ModuleOne Feature

Background: User login
Given User logged in

@Regression
Scenario: Create a new Contact
When Create Contact is clicked

@Regression @Smoke
Scenario: Update a  Contact
When Update Contact is clicked

@Regression
Scenario: Create a new Companies
When Create Companies is clicked

@Smoke
Scenario: Update a Companies
When Update Companies is clicked

@Smoke
Scenario: Create a new Deals
When Create Deals is clicked

@Smoke
Scenario: Update a  Deals
When Update Deals is clicked

Scenario: Logout
Then User click logout