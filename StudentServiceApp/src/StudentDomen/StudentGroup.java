package StudentDomen;

import java.util.Iterator;
import java.util.List;
// класс studentGroup
public class StudentGroup implements Iterable<Student>  , Comparable<StudentGroup>{
    //  список студентов
   private List<Student> students; 
   private int numGroup;
// конструктор
public StudentGroup(List<Student> students, int numGroup){
    this.students = students;
    this.numGroup = numGroup;
   }
// получить список студентов
   public List<Student> getStudents() {
    return students;
}
// изменить список студентов
public void setStudents(List<Student> students) {
    this.students = students;

}
// метод для получения номера группы
public int getNumberGroup(){
    return numGroup;
}
// изменить номер группы студентов
public void setNumberGroup(int numGroup){
    this.numGroup = numGroup;
}
// @Override
// public Iterator<Student> iterator() {
//     return  new StudentGroupIterator(students);// вместо вот этого и чтобы не создавать доп класс studentGroupIterator, можно сделать вот так как ниже
// }

    @Override
    public Iterator<Student> iterator(){
        return new Iterator<Student>() {
            private int index = 0;
            @Override
    public boolean hasNext() {
        return index < students.size();
    }
    @Override
    public Student next() {
        if(!hasNext())
        {
            return null;
        }
        
        return students.get(index++);
    }

        };
    }
    public int compareTo(StudentGroup studentGroup) {
        if(studentGroup.students.size() == students.size())
        {
            return 0;
        }
        if(studentGroup.students.size() < students.size())
        {
            return -1;
        }
        return 1;
        
   }
   @Override
 //переопределние метода
 public String toString() 
 {
     String result = "Номер группы " + numGroup + 
     " количество студентов " + students.size();
    return result;
}
}





