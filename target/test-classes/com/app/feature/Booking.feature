Feature: Flight ticket booking

Scenario: Search flight between the given source and destination
	Given Load the url "https://www.cheapoair.com/"
	When Enter the source "DEL"
	And Enter the destination "DEL"
	And Select the date "02/12/2025"
	And Select trip "One-way"
	And Select travelers 
	And Click on Search flights
	Then Validate the result page
	
Scenario: Change currency from USD to INR	
	Given Result page is loaded
	When Click on currency and select "INR"
	Then Validate that flight rate is displayed in INR
	
	
Scenario: Selection of flight with lowest fare	
	Given  Result page with changed currency is loaded
	When Select the flight with lowest fare
	Then Validate the flight booking page