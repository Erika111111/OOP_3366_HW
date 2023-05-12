package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Controller.iGetModel;
// класс Model2 для передачи данных о студенте 
public class Model2 implements iGetModel{
    // список студентов
    private HashMap<Long, Student> map;
    // конструктор
    public Model2(HashMap<Long, Student> map) {
        this.map = map;
    }

    @Override
    // метод выдачи списка студентов
    public List<Student> getAllStudent() {
    List<Student> studList = new ArrayList<Student>(); 

    for (var stud : map.entrySet())
        studList.add(stud.getValue());
    return studList;
}
    


}

    
   

