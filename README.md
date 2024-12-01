# SpringBootApi

+-----------------+        +-----------------+
|   MyController  |        |  CourseService  |
+-----------------+        +-----------------+
| - courseService |<>------| + getCourses()  |
| + home()        |        | + getCourse()   |
| + getCourses()  |        | + addCourse()   |
| + getCourse()   |        | + updateCourse()|
| + addCourse()   |        | + deleteCourse()|
| + updateCourse()|        +-----------------+
| + deleteCourse()|
+-----------------+



+-------------------+        +-----------------+
| CourseServiceImpl |        |     Course      |
+-------------------+        +-----------------+
| - courseRepository|<>------| - id            |
| + getCourses()    |        | - title         |
| + getCourse()     |        | - description   |
| + addCourse()     |        | + getId()       |
| + updateCourse()  |        | + getTitle()    |
| + deleteCourse()  |        | + getDescription()|
+-------------------+        +-----------------+
