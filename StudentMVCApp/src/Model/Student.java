package Model;

public class Student extends User implements Comparable<Student>{

    private long idStudent;

    public Student(String name, String surname, int age, Long idStudent){
        super(name,surname,age);
        this.idStudent = idStudent;
    }
    // получаем id студента
    public long getIdStudent(){
        return idStudent;
    }
    // устанавливаем id студента
    public void setIdStudent(Long idStudent){
        this.idStudent = idStudent;
    }

    @Override
 //переопределние метода
 public String toString() 
 {
     return "Student{" + 
     "surname= '" + super.getSurname() + '\'' +
     ", name= '" + super.getName() + '\'' +
     ", age= '" + super.getAge() + '\'' +
     ", idStudent= '" + idStudent + '\'' +
     '}';
}
    @Override
    // сортировка по возрасту студентов
    public int compareTo(Student o) {
        System.out.println(super.getName() + "-" + o.getName());
        if(super.getAge() == o.getAge()){
             return 0;
         }
         if(this.getAge() < o.getAge()){
             return -1;
         }
         return 1;
     }
    // сортировка по  ip студента
    // public int compareTo(Student o){ 
       
    //     if(this.idStudent == o.idStudent){
    //         return 0;
    //     }
    //     if(this.idStudent < o.idStudent){
    //         return -1;
    //     }
    //     return 1;
    // }
    }
    
    

