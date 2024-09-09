package HomeWork4.controller;
import HomeWork4.data.Teacher;
import HomeWork4.service.TeacherService;
import HomeWork4.view.TeacherView;

import java.util.List;

public class TeacherController implements UserController{
    private final TeacherService teacherService = new TeacherService();
    private final TeacherView teacherView = new TeacherView();
    @Override
    public void create(String firstName, String secondName, String lastName) {
        teacherService.create(firstName, secondName, lastName);
    }

    public List<Teacher> getAllTeacher() {
        return teacherService.getAll();
    }

    public void printAllTeacher() {
        teacherView.sendOnConsole(getAllTeacher());
    }
}