# Student Management System with CRUD Operations using Spring Boot
<br>
This project showcases the implementation of a Student Management System using Spring Boot, providing CRUD (Create, Read, Update, Delete) operations to efficiently manage student records.
<br>
<b>Overview</b>
The StudentController class handles HTTP requests and interfaces with the database through the StudentRepository. Key functionalities include:

Create Record: Add a new student record to the database.
Get All Records: Retrieve all student records from the database.
Get One Record: Retrieve a specific student record by providing the student roll number.
Update Record: Update an existing student record in the database.
Delete One Record: Delete a specific student record by providing the student roll number.
Delete All Records: Delete all student records from the database.
Project Structure
The project follows a Spring Boot architecture, organized into a RESTful API with the StudentController managing CRUD operations. The underlying data is stored and retrieved using the StudentRepository.

Usage
Create a New Record:

Endpoint: /api/students
Method: POST
Request Body: JSON representing the student details.
Response: Message confirming the successful creation of a new student record.
Get All Records:

Endpoint: /api/students
Method: GET
Response: A list of all student records in JSON format.
Get One Record:

Endpoint: /api/students/{studentroll}
Method: GET
Path Variable: studentroll - the roll number of the student to retrieve.
Response: JSON representing the details of the requested student.
Update Record:

Endpoint: /api/students/{studentroll}
Method: PUT
Path Variable: studentroll - the roll number of the student to update.
Request Body: JSON representing the updated student details.
Response: Message confirming the successful update or indicating that the student was not found.
Delete One Record:

Endpoint: /api/students/{studentroll}
Method: DELETE
Path Variable: studentroll - the roll number of the student to delete.
Request Body: JSON representing the student details (not required).
Response: Message confirming the successful deletion of the specified student record.
Delete All Records:

Endpoint: /api/students
Method: DELETE
Response: Message confirming the successful deletion of all student records.
Contributing
Contributions are welcome! Feel free to submit pull requests or raise issues following the guidelines outlined in the CONTRIBUTING.md file.

License
This project is licensed under the MIT License. See the LICENSE file for details.
