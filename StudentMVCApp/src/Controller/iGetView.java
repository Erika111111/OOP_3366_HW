package Controller;


import java.util.List;

import Model.Student;

public interface iGetView {
    // метод вызова
    void printAllStudent(List<Student> students);

    // метод для вывода в консоль сообщения  и прием введенной информации обратно
    String prompt(String message);

    
    
}
