package View;

import java.util.List;
import java.util.Scanner;

import Controller.iGetView;
import Model.Student;

public class ViewEng implements iGetView{
    // метод вызова вывода списка всех студентов
    public void printAllStudent(List<Student> students)
    {
        System.out.println("-------list students-------");
        for(Student st: students)
        {
            System.out.println(st);
        }
        System.out.println("-------end list students-------");
    }
    // считывание данных с консоли
    public String prompt(String message)
    {
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        return in.nextLine();
    }
}


