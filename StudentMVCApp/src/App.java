import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
//import java.util.Map;

import Controller.Controller;
import Controller.iGetModel;

import Controller.iGetView;
import Model.FileRepo;
//import Model.Model;
import Model.Model2;
import Model.Student;
//import View.View;
import View.ViewEng;

public class App {
   

    public static void main(String[] args) throws Exception {
        List<Student> students = new ArrayList<Student>();
        Student s1 = new Student("Sergey", "Ivanov", 34, (long)234);
        Student s2 = new Student("Ilya", "Petrov", 30, (long)111);
        Student s3 = new Student("Semen", "Patih", 33, (long)765);
        Student s4 = new Student("Svetlana", "Mitina", 35, (long)999);
        Student s5 = new Student("Yana", "Olina", 22, (long)567);
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);

        HashMap<Long, Student> map = new HashMap<Long, Student>();
        Student m1 = new Student("Sergey", "Ivanov", 34, (long)234);
        Student m2 = new Student("Ilya", "Petrov", 30, (long)111);
        Student m3 = new Student("Semen", "Patih", 33, (long)765);
        Student m4 = new Student("Svetlana", "Mitina", 35, (long)999);
        Student m5 = new Student("Yana", "Olina", 22, (long)567);
        map.putIfAbsent((long) 1, m1);
        map.putIfAbsent((long) 2, m2);
        map.putIfAbsent((long) 3, m3);
        map.putIfAbsent((long) 4, m4);
        map.putIfAbsent((long) 5, m5);

       

        FileRepo FileRepo = new FileRepo("StudentsDB.txt");
        // for(Student pers : students)
        // {
        //     FileRepo.addStudent(pers);
        // }
        // FileRepo.saveAllStudentsToFile();


        // в моделе лежит список студентов
        //iGetModel model = new Model(students);
        iGetModel modeFileRepo = FileRepo;
        iGetModel model = new Model2(map);
        
        
       

        iGetView view = new ViewEng();
        //iGetView view = new View();
        Controller control = new Controller(view, model);
        control.run();
        //control.updateView();

        


        

       

    }
}
