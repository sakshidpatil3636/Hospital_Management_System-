Project Overview<br>
This Hospital Management System is a console-based application developed in Java. It efficiently manages various aspects of a hospital, including doctors, nurses, departments, and patient records. The project utilizes different data structures to handle specific functionalities, ensuring optimal performance and ease of use.

Features<br>
Hospital Information Management:

Track the number of doctors and nurses.
Assign doctors to specific departments and floors.
Maintain information on the number of departments.
Patient Management:

Add and remove patients from the list using a queue system.
Maintain detailed records of patients, including their ID, name, and assigned doctor.
Ambulance Management:

Manage ambulance availability using a stack data structure.
Staff Information:

Store and retrieve information about doctors and nurses using linked lists.
Frequently Asked Questions:

Include FAQs for better understanding and navigation of the system.
Complete Hospital Overview:

Provide a comprehensive overview of the hospital's website (without a frontend).

Data Structures Used : 
Queue: Used to manage the patient list for each doctor.
Stack: Used for managing ambulance availability.
Linked List: Used to store information about doctors, nurses, and patients.
and many more..

Project Structure<br>
Main.java: The main entry point of the application.
Hospital.java: Manages hospital information.
Doctor.java: Stores and manages doctor information.
Nurse.java: Stores and manages nurse information.
Patient.java: Stores and manages patient information.
Ambulance.java: Manages ambulance availability.
Department.java: Manages hospital departments.
FAQ.java: Manages frequently asked questions.

How It Works<br>
Hospital Information Management<br>
Doctors and Nurses: <br>
The application stores the number of doctors and nurses, their IDs, and names using linked lists. Each doctor is assigned to a specific department and floor.
Departments: <br>
Each department is linked to a floor and has assigned doctors.
Patient Management<br>
Patient Queue: <br> 
Patients are added to a queue and assigned to doctors. Once a doctor attends to a patient, the patient is removed from the queue.
Patient Records: <br>
Detailed records of patients, including their ID and name, are maintained using linked lists.
Ambulance Management<br>
Ambulance Stack: <br>
The availability of ambulances is managed using a stack. When an ambulance is needed, it is popped from the stack, and when it returns, it is pushed back onto the stack.
Frequently Asked Questions<br>
The system includes a section for frequently asked questions to help users navigate and understand the functionalities better.


