# SpringBootApi
### Project Overview

This project is a Spring Boot application that provides a RESTful API for managing courses. It includes endpoints for creating, reading, updating, and deleting courses.

### Technologies Used

- Java
- Spring Boot
- Maven

### Project Structure

- `MyController`: This class is a REST controller that handles HTTP requests for the course management API.
- `CourseService`: This interface defines the methods for managing courses.
- `CourseServiceImpl`: This class implements the `CourseService` interface and contains the business logic for managing courses.
- `Course`: This class represents the course entity with attributes such as `id`, `title`, and `description`.
- `SpringRestApplication`: This is the main class that serves as the entry point for the Spring Boot application.

### Endpoints

- `GET /home`: Returns a welcome message.
- `GET /courses`: Retrieves a list of all courses.
- `GET /courses/{courseId}`: Retrieves a specific course by its ID.
- `POST /courses`: Adds a new course.
- `PUT /courses`: Updates an existing course.
- `DELETE /courses/{courseId}`: Deletes a course by its ID.

### How to Run

1. Clone the repository.
2. Navigate to the project directory.
3. Run `mvn spring-boot:run` to start the application.
4. Access the API at `http://localhost:8080`.

### Example Usage

- To get a list of all courses:
  ```sh
  curl -X GET http://localhost:8080/courses
  ```

- To add a new course:
  ```sh
  curl -X POST -H "Content-Type: application/json" -d '{"title": "New Course", "description": "Course Description"}' http://localhost:8080/courses
  ```

### License

This project is licensed under the MIT License.

![image](https://github.com/user-attachments/assets/fd4b6efd-bdd9-43ce-ae1a-8dbb5680dd29)

