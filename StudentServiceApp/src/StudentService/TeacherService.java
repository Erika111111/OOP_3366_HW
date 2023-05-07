package StudentService;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Teachers;
import StudentDomen.UserComporator;
// класс TeacherServiese
public class TeacherService implements iUserService<Teachers>{
    private int countT;
    private List<Teachers> teachers;
// конструктор
    public TeacherService() {
        
        this.teachers = new ArrayList<Teachers>();
    }
// метод вывода списка учителей
     @Override
     public List<Teachers> gelAll() {
         return teachers;
     }
    @Override
    public void create(String name, String surname, int age) {
        Teachers per3 =  new Teachers(name, surname, age, countT, surname);
        countT++;
        teachers.add(per3);
        
    }
    public List<Teachers> getSortedByFIOTeachers()
    {
        List<Teachers> teach = new ArrayList<>(teachers);
        teach.sort(new UserComporator<Teachers>());
        return teach;
    }


 
   
}
