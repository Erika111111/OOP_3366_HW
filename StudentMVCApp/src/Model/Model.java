package Model;

import java.util.List;

import Controller.iGetModel;

public class Model implements iGetModel{
    private List<Student> students;

    public Model(List<Student> students) {
        this.students = students;
    }
    // метод выдачи списка студентов
    public List<Student> getAllStudent()
    {
        return students;
    }
    
}
