package HomeWork6.became.service;

import HomeWork6.became.data.Student;
import HomeWork6.became.data.StudentGroup;

import java.util.List;

abstract class StudentGroupQueryService {
    abstract Student findStudent(String firstName, String secondName);
    abstract List<Student> sortStudents(StudentGroup studentGroup);
}