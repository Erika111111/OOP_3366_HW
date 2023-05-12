package Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Model.Model;
import Model.Student;
import View.View;


    // класс Controller связующий между view и model
public class Controller {
    private List<Student> students;
    // создаем поле View  и Model так как controller обьединяет view  и model
    private iGetView view;
    private iGetModel model;
   

    // конструктор
public Controller(iGetView view, iGetModel model) {
        this.view = view;
        this.model = model;
        this.students = new ArrayList<Student>();
       
        
    }
    //  этот метод для MVP берем данные от модели и кладем их в controller(Presenter)
public void getAllStudent()
{
    students = model.getAllStudent();
}
    // тоже метод для mvp
public boolean testData()
{
    if(students.size() > 0)
    {
        return true;
    }
    else
    {
        return false;
    }
}

    // получит данные от Model и отдаст View
public void updateView()
{
    // метод mvc
    //view.printAllStudent(model.getAllStudent()); // в метод view передаем метод из model со списком студентов
    // mvp т.е. если в списке есть данные, то мы их отдаем view
    getAllStudent();
    if(testData())
    {
        view.printAllStudent(students);
    }
    else
    {
        System.out.println("Спимок студентов пуст");
    }

}
    // метод взаимодействия с пользователем
    public void run()
    {
        Commands com = Commands.NONE;
        boolean getNewIteration = true;
        while(getNewIteration)
        {
            String command = view.prompt("Введите команду");
            com = Commands.valueOf(command.toUpperCase());
            switch(com)
            {
                case EXIT: 
                    getNewIteration = false;
                    System.out.println("Выход из программы");
                    break;
                case LIST:
                    getAllStudent();
                    updateView();
                    break;    




            }
        }
    }

}
