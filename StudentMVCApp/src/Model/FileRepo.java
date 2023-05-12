package Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import Controller.iGetModel;

public class FileRepo implements iGetModel{
    private String fileName;
    private List<Student> students;
    public FileRepo(String fileName) {
        this.fileName = fileName;
        this.students = new ArrayList<>();
        try(FileWriter fw = new FileWriter(fileName, true))
        {
            fw.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void addStudent(Student student)
    {
        this.students.add(student);
    }

    public void readAllStudentsFromFile()
    {
        try {
            File file = new File(fileName); // взяли информацию из ос о файле
            FileReader fr = new FileReader(file); // подключаемся к файлу
            BufferedReader reader = new BufferedReader(fr); // открываем с ним соединение
            String line = reader.readLine(); //считываем данные построчно
            while (line !=null) 
            {
                String[] param = line.split(" ");
                Student pers = new Student(param[0], param[1], Integer.parseInt(param[2]), Long.parseLong(param[3]));
                students.add(pers);
                line = reader.readLine();
            }


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void saveAllStudentsToFile()
    {
        try(FileWriter fw = new FileWriter(fileName, true))
        {
            for(Student pers : students)
            {
                fw.write(pers.getName() + " " + pers.getSurname() + " " + pers.getAge() + " " + pers.getIdStudent());
                fw.append('\n');
            }
            fw.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    @Override
    public List<Student> getAllStudent() {
        readAllStudentsFromFile();
        return students;
    }
    



}
