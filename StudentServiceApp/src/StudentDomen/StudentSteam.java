package StudentDomen;


import java.util.Iterator;
import java.util.List;
// класс StudentSteam
public class StudentSteam implements Iterable<StudentGroup>{
    // список студенческого курса
    private List<StudentGroup> course;
    // номер потока
    private int numberSteam;
    

    //конструктор
    public StudentSteam(List<StudentGroup> course, int numberSteam) {
        this.course = course;
        this.numberSteam = numberSteam;
        
    }
    
    // получить список студенческого курса
    public List<StudentGroup> getSteam(){
        return course;
    }
    // изменить список студенческого курса
    public void setSteam(List<StudentGroup> course){
        this.course = course;
    }
    // получить номер потока
    public int getNumberSteam(){
        return numberSteam;
    }
    // изменить номер потока
    public void setNumberSteam(int numberSteam){
        this.numberSteam = numberSteam;
    }
    // перегрузка метода Итератора с использованием анонимного класса
    @Override
    public Iterator<StudentGroup> iterator() {
        return new Iterator<StudentGroup>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < course.size();
            }

            @Override
            public StudentGroup next() {
                if(!hasNext())
                {
                    return null;
                }
                return course.get(index++);
            }
        };
    }
}
