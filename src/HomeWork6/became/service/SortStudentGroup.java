package HomeWork6.became.service;

import HomeWork6.became.data.Student;

import java.util.List;

public interface SortStudentGroup extends StudentSortService{
    @Override
    List<Student> sortStudents();
}