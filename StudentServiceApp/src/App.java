import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.swing.GroupLayout.Group;

import Controller.EmploeeController;
import StudentDomen.Emploee;
import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.StudentSteam;
import StudentDomen.Teachers;
import StudentDomen.User;
import StudentService.TeacherService;

public class App {
    public static void main(String[] args) throws Exception {
        // User u1 = new User("Andrey", "Petrov", 20);
        // Student s1 = new Student("Sergey", "Ivanov", 25,(long)123);
        // Student s2 = new Student("Anna", "Mitina", 21,(long)001);
        // Student s3 = new Student("Polina", "Dmitrieva", 27,(long)456);
        // Student s4 = new Student("Maria", "Ctepanova", 32,(long)678);
        // Student s5 = new Student("Vyacheslav", "Portnov", 33,(long)987);
        // Student s6 = new Student("Erika", "Mitiykova", 33,(long)555);
        // Student s7 = new Student("Marina", "Makeeva", 30,(long)987);
        // Student s8 = new Student("Ilya", "Tarasov", 32,(long)999);
        // Student s9 = new Student("Uriu", "Portnov", 35,(long)888);
        Teachers t1 = new Teachers("Olga", "Cmirnova", 45, 111, "доктор");
       // Teachers t2 = new Teachers("Pavel", "Navazov", 35, 675, "учитель высшей категории");
       // Teachers t3 = new Teachers("Mariya", "Osipova", 55, 234, "кандидат наук");
        //Teachers t4 = new Teachers("Elena", "Limina", 33, 812, "-");
        
       // teach.add(t1);
       // teach.add(t2);
       // teach.add(t3);
        //teach.add(t4);
       TeacherService teachServ = new TeacherService();
       teachServ.create("Olga", "Cmirnova", 45);
       teachServ.create("Pavel", "Navazov", 35);
       teachServ.create("Mariya", "Osipova", 55);
       teachServ.create("Elena", "Limina", 33);

       List<Teachers> teachSort = teachServ.getSortedByFIOTeachers();

       for(Teachers t : teachSort)
       {
        System.out.println(t);
       }

        
        

        // //StudentSteam steam1 = new StudentSteam(null, 1);
        // //StudentGroup g1 = new StudentGroup(null);
        // //StudentGroup g2 = new StudentGroup(null);
        // // список студентов1
        // List<Student> listStudents = new ArrayList<Student>();
        // listStudents.add(s1);
        // listStudents.add(s2);
        // listStudents.add(s3);
        // listStudents.add(s4);
        // // список студентов2
        // List<Student> listStudents2 = new ArrayList<Student>();
        // listStudents2.add(s5);
        // listStudents2.add(s6);
        // listStudents2.add(s7);
        // // список студентов3
        // List<Student> listStudent3 = new ArrayList<Student>();
        // listStudent3.add(s8);
        // listStudent3.add(s9);


        // // экземпляры класса StudentGroup
        // StudentGroup group1 = new StudentGroup(listStudents, 1);
        // StudentGroup group2 = new StudentGroup(listStudents2, 2);
        // StudentGroup group3 = new StudentGroup(listStudent3, 3);


        // // список студенческих групп
        // List<StudentGroup> listSteam = new ArrayList<StudentGroup>();
        // listSteam.add(group1);
        // listSteam.add(group2);
        // listSteam.add(group3);

        // // экземпляр класса StudentSteam
        // StudentSteam steam = new StudentSteam(listSteam, 1);
        
       
        //  for(StudentGroup grS: steam)
        //  {
        //      System.out.println(grS.getNumberGroup());
        //      for(Student std: grS){
        //         System.out.println(std);
        //      }
             
        //     System.out.println(steam);
        //  }

        //  Collections.sort(steam.getSteam());
         
         //System.out.println(steam);

        // for(Student stud: group)
        // {
        //     System.out.println(stud);
        // }
        // System.out.println("___________после сортировки________");
        // Collections.sort(group.getStudents());

        // for(Student stud: group)
        // {
        //     System.out.println(stud);
        // }
        Emploee E1 = new Emploee("Ivan", "Ivanov", 45, 123);
        
        EmploeeController.paySalary(E1);
       
        Integer stubentHour[] = {124,654,345,234,123};
        System.out.println(EmploeeController.mean(stubentHour));

       // System.out.println(u1);
        //System.out.println(s1);
        //System.out.println(t1);
        //System.out.println(group);
    }
}
