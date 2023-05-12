package View;


import java.util.List;
import java.util.Scanner;

import Controller.iGetView;
import Model.Student;

public class View implements iGetView{

    // метод вызова в консоль
    public void printAllStudent(List<Student> students)
    {
        System.out.println("-------Вывод списка студентов-------");
        for(Student st: students)
        {
            System.out.println(st);
        }
        System.out.println("-------Конец списка студентов-------");
    }

    public String prompt(String message)
    {
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        return in.nextLine();
    }

}

