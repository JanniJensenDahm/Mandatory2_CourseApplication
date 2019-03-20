# Mandatory2_CourseApplication

localhost:8080                            loginpage (dosen't work yet)

AS ADMIN
localhost:8080/admin/adminSite            Nothing here yet
                                          From this site you can go to a list of students 'studerende', list of teachers 'Undervisere'
                                          or list of courses 'Kursus liste'
                                  
localhost:9090/admin/studentList          Student List
                                          From here you can create a new student 'Opret studerende' or
                                          edit a student 'Redigér' (dosen't work yet)

localhost:9090/admin/teacherList          Teacher List
                                          From here you can create a new teacher 'Opret underviser' or
                                          edit a teacher 'Redigér' (dosen't work yet)
                                        
localhost:8080/admin/courseList           Course List
                                          From here you can see a list of students for a specific course 'Studerende'.

localhost:8080/admin/courseStudents/{id}  From here you can manually add students to the course.

AS TEACHER
localhost:8080/teacher/teacherSite        Nothing here yet
                                          From this site you can go to a list of courses 'Kursusliste'
                                          
localhost:8080/teacher/courseList         From here you can create a new course 'Opret Kursus', edit a specific course 'Redigér'
                                          or delete a specific course 'Slet'
                                          
AS STUDENT
localhost:8080/student/studentSite        Nothing here yet
                                          From this site you can go to a list og courses 'KursusList'
                                          
localhost:8080/student/courseList         From here you can see info about a specific course 'Se Kursus'


ASSIGNMENT DESCRIPTION
Mandatory Assignment 2
Courses: SWC3
Class: DAT17C
Semester: Fall 2018

This is one of the compulsory assignments you need to hand in, and pass, to qualify for 3rd semester exam. 

The final product of these mandatory assignments must be presented in front of your teachers by the deadline.

You are allowed to work in groups of max 3 persons. I do not recommend you to work alone as this assignment is large!

Dat17C hand in date:
Hand in date: 
6 December 2018, latest at 14:00, on Fronter.
Hand in info: 
You must submit a link to your git repo. 
In the git repo you will include your source code. Furthermore on the root of the repo you will have a “readme.md” file where you will describe your solution. This description will be brief and will focus on the “Deploy part”. 

The assignment:
At our university, each semester students are assigned to courses (mandatory or electives). At the moment the process of presenting and assigning to these courses is not digital. You are to create a web-app that will digitalize this system.

The users of the system:
There are 3 types of users for this system:
Student. This user will login with the school credentials and can do the following tasks:
Search for courses
Sign up for a course
See a list with the courses he/she signed up for
Teacher. This user will login with the school credentials and can do the following tasks:
Create a new course with all the course information (see Course info section)
Edit a course they created or they are teaching with other teachers.
Administration worker. This user will login with the school credentials and can do the following tasks:
See a list of the students that signed up for a specific course. This list will be sorted according to the timestamp of the signed up moment.
Approve or reject a signed up request from the student.

Let’s build it
You are to build this web-app using the Spring Framework. The data produced by this system will be stored on a Database (MySQL or other - this is up to you).

Course info
Each course will contain the following informations. This data is provided by the teacher and the students can only view this data.
Name of the course in Danish
Name of the course in English
Study Programme. One or more of the following options:
Computer Science 
Web Development
Software development
IT-Security
Mandatory or Elective
ECTS
Course language
Minimum number of students
Expected number of students
Maximum number of students
Prerequisites
Learning outcome
Content
Learning activities
Exam form
Teachers

Here is an example of this info for a specific course:
Name of the course (Danish):    Full Stack NodeJs
Name of the course (English):   Full Stack NodeJs
Semester:                       2
Class code:                     WD-2018-F-NODEJS
Study Programme:                Web Development
Mandatory or Elective:          Elective
ECTS:                           10
Course language:                English
Minimum # of students:          15
Expected # of students:         35
Maximum # of students:          50
Prerequisites:                  Students must know HTML, CSS, JS, PHP and MySQL.
Learning outcome:               Students will be able to code a full stack web based application, set-up a NODEJS server in the cloud                                   and decide the best possible use of MongoDB
Content:                        NodeJS, Flexbox, Grid, CSS, MongoDB, AJAX, Websockets, JSON objects, Setting up a server in Amazon Web                                   Servers and locally. Use of the terminal and FTP. Also, the setup and use of HTTPS.
Learning activities:            Individual work and exam. Communication takes place via our Ryver channel WD-2018-F-NODEJS
Exam form:                      Internal oral exam based on hand in product. Graded based on the 7-scale.
Teachers:                       Santiago Donoso (sand@kea.dk) Constantin Alexandru Gheorghiasa (coag@kea.dk)

Must-have requirements:
- CRUD for course. This includes also a list with the students assigned to this course.

Nice-to-have requirements:
- Login for each type of the user
- All the requirements for the different type of user
- Auto update of the content on pages when need it (jQuery)
- A user-friendly design.
