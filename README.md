Overview
The Parking Lot System is a command-line-based application implemented in Java that simulates the operations of a parking lot. It allows users to create a parking lot, park cars, leave the parking lot, and retrieve information about parked cars.

Features
Create a Parking Lot: Initialize the parking lot with a specified number of slots.

Park a Car: Allocate a parking slot to a car with a given registration number and color.

Leave Parking Lot: Free up a parking slot when a car exits the parking lot.

Find Registration Numbers by Color: Retrieve registration numbers of cars with a specific color.

Find Slot Number by Registration Number: Identify the slot number where a car with a given registration number is parked.

Find Slot Numbers by Color: Get slot numbers where cars of a particular color are parked.

Check Parking Lot Status: View the current status of the parking lot, including occupied slots and car details.

How to Use
Prerequisites
Java Development Kit (JDK) installed on your machine.

A terminal or command prompt to run the Java program.

Steps
Compile the Code:
javac ParkingLotSystem.java

Run the Program:
java ParkingLotSystem

Execute Commands:
Type commands as described in the problem statement example:
create_parking_lot 6

park KA-01-HH-1234 White

park KA-01-HH-9999 White

park KA-01-BB-0001 Black

leave 4
status
Exit the Program:

Type exit to terminate the program.

