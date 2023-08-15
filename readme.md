



Project Requirements:

Your task is to develop an Air-ticket Booking System. Below is the list of functions that the application should be able to support. 

       On the user side: 

1.	User Registration and Login: Allow users to create an account and log in to access the booking functionality.
2.	Flight Listing: Display a list of available flights with details like airline, departure time, arrival time, and price.
3.	Booking Process: Guide users through the booking process, including passenger details, payment, and confirmation.
4.	Booking Management: Allow users to view and manage their booked tickets, including modifying or canceling bookings.
5.	Ticket Confirmation: Print booking confirmation with the ticket details and a unique ticket number.

       On the admin side: 

1.	Admin Panel: Provide an admin panel with secure access for managing flights, users, and bookings.
2.	Flight Management: Allow admins to add, update, or delete flights, manage seat availability, and adjust prices.
3.	User Management: Enable admins to view and manage user accounts, including user details and account status.

You may consider to have User, Flight, Ticket, and Airline classes:

•	The User class represents the system users and includes attributes such as userId, name, email, and password. It also has methods for user registration, login, and logout.

•	The Flight class represents individual flights and contains attributes such as flightNumber, airline, source, destination, departureTime, arrivalTime, price, and availableSeats. It provides methods for checking seat availability, booking seats, and retrieving flight details.

•	The Ticket class represents the ticket booking information and includes attributes such as ticketNumber, passenger, flight, seatNumber, and status. It provides methods for creating, modifying, and canceling tickets.

•	The Airline class represents the airline company and acts as a central control for managing flights, users, and tickets. It contains lists of flights, users, and tickets, and provides methods for adding, updating, and deleting flights, registering and deleting users, viewing tickets, and generating statistics.




The relationships of the above listed classes could be as below:

•	The User class has a one-to-many relationship with the Ticket class, as a user can have multiple tickets.

•	The Flight class has a one-to-many relationship with the Ticket class, as a flight can have multiple tickets.


•	The Airline class has one-to-many relationships with the Flight, User, and Ticket classes, as it manages multiple flights, users, and tickets.

Keep in mind that this is a simplified representation, and you can further expand and refine the classes and their relationships based on your specific requirements and system design.
 
Your final product can be in command-line interface and your project should be able to compile and run during submission. Marks will be deducted if the lecturer needs to debug your code during marking.


Submission: 

•	Zip the project folder, which includes completed Java source code, byte code, and related resources. Deadline:  In the week of  14-18 Aug ’23 before interview practical session.
•	Presentation and interview: to be conducted during practical session of the week 14-18 Aug ’23.

Instruction to students:

Mini-Project constitutes 30% of the total marks. It is a non-redistributable component (NRC) of the module. It allows up to two students to work in one project. One submission for each project. Lecturers are around in the scheduled classes to facilitate the project development. 

Important Notice 

1. You will be awarded 0 marks, if:
(i)   Work submitted was not developed by you, or
(ii)  All deliverables are not submitted in time, or
(iii) Code is not submitted

2. Print out the marking scheme Rubric. Please do a self-evaluation on your contribution of the project before the presentation and interview.

3.	Marks allocated will be based on the adherence to deadlines, attendance, level of difficulty and creativity of the completed application.
