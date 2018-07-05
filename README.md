# Visitor-List
Visitor List in Immigration Department 

## Installation
Add BigProgram to your Eclipse enviroment.

### Requirements
* Eclipse

## System Functionality

* simple command line interface, which will allow a staff member at the counter to add a new person into the list. When a new person is added into the system, they will be required to add their:
first name, 
last name, 
date of arrival and 
passport number. 
When the person is added, after its information is collected, they should be added as a new object to the end of the Linked List.
* At any time, the staff member has the ability to see what position in the linked list a person is, by typing in a unique ID number that is given to the person when they register in the system.
* A function exists to select a position in the linked list, e.g., position 4, and put a new person with a kid into that position. The person who was at position 4, then be pushed to position 5 and so on for each different person.
* If a person comes into the immigration department who has kids (age less than 1 year), they should be given the very first position in the linked list. The person who was originally number 1, should then be moved to position 2.
* At any time, the staff member should have the ability to delete a person from the system by entering in their unique ID number. If the person is removed from the linked list, their object should be removed and whoever was in front of them should be jointed to the person who was behind them.
* Each operations has an individual methods to encapsulate the functionality.
* A method to cut off the last N number of records from the linked list. If the staff member types in 3. Then the last 3 objects on the linked list should be removed.
* Given a person unique number, the staff member is able to update the information for that person, without impacting where they currently are in the list.


## Project Brief
Visitor List in Immigration Department

An Immigration department has contacted you outlining that they currently do not have a method of processing who is next in line to be seen by the immigration officer at the counter. As the immigration department is quite busy in the months of September and February due to new students in the country, often the people take a ticket, leave and then come back later to see if it is their time to be meet with the immigration officer. Since the various kinds of visitors (Business, Patients and Families) are present in the immigration department for the extension of their immigration. Sometimes, the parents with their kids needs some special treatment because of children less than three years, that need to jump into the middle of the list of waiting people for their immigration renewal.
Design and implement a command line application that allows the immigration officer in the immigration department to add new candidates to a list, check the position of a current person by name in the list, and add or remove people from the list at different positions.
Use a Linked List data structure to store the data.


## Contributing
Pedro Alberto Duenas Orozco 

Roberto Alejandro Rivera




