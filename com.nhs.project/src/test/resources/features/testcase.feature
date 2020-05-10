@EndToEnd
Feature: NHS Costs checker End to End journey

			To verrify the functionlaity of NHS Costs checker tool
      
  Background:
   
    Given I navigate to NHS Costs checker tool

  @Sanity
  Scenario: Wales Test Ticket - Acceptance Criteria
            
      Given I am a person from Wales
			When I put my circumstances into the Checker tool
			Then I should get a result of whether I will get help or not