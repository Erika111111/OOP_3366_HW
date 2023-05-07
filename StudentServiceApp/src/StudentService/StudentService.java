package StudentService;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Student;

public class StudentService implements iUserService<Student>{
    private int count;
    private List<Student> students;

public StudentService() {
    this.students = new ArrayList<Student>();
    }

@Override
// создать
public void create(String name, String surname, int age) {
    Student per = new Student(name, surname, age, null);
    count++;
    students.add(per);
    
}
// метод вывода всех студентов
@Override
public List<Student> gelAll() {
   
    return students;
}


}

