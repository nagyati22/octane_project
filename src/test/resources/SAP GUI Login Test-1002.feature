#Auto generated Octane revision tag
@TID1002REV0.2.0
Feature:
	Scenario: SAP GUI application started and login successful
		Given A valid username/password
		When SAP GUI started
        And Username/Password filled up
        And clicked on login
		Then SAP GUI login successful
