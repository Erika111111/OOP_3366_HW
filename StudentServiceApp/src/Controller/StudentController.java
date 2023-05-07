package Controller;

import StudentDomen.Student;

import StudentService.StudentService;

public class StudentController implements iUserControllers<Student>{

    private final StudentService dataService = new StudentService();
   


    @Override
    public void create(String name, String surname, int age) {
        dataService.create(name, surname, age);
    }
    
}
