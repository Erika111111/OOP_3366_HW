package StudentDomen;



//  класс Учителя
public class Teachers extends User{

   
    private int idTeacher;
    private String academicDegree;
// конструктор
    public Teachers(String name, String surname, int age, int idTeacher, String academicDegree) {
        super(name, surname, age);
        this.idTeacher = idTeacher;
        this.academicDegree = academicDegree;
    }


// получить id
    public int getIdTeacher(){
        return idTeacher;
    }
// получить ученую степень
    public String getAcademicDegree()
    {
        return academicDegree;
    }

// добавить  id
    public void setIdTeacher(int idTeacher){
        this.idTeacher = idTeacher;
    }
//добавить ученую степень
    public void setAcademicDegree(String academicDegree)
    {
        this.academicDegree = academicDegree;
    }

    @Override
 //переопределние метода
 public String toString() 
 {
     return "Teacher{" + 
     "surname='" + super.getSurname() + '\'' +
     ", name='" + super.getName() + '\'' +
     ", age='" + super.getAge() + '\'' +
     ", idTeacher='" + idTeacher + '\'' + 
     ", academicDegree='" + academicDegree + 
     '}';
}
    
}


