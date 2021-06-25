@E2E
Feature: CRM Module Two Feature

@Regression @Smoke
Scenario: Create a new Tasks
Given User logged in
When Create Tasks is clicked

@Smoke
Scenario: Update a  Taks
Given User logged in
When Update Tasks is clicked

Scenario: Create a new Cases
Given User logged in
When Create Cases is clicked

Scenario: Update a  Cases
Given User logged in
When Update Cases is clicked