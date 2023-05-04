package StudentDomen;

public class Teachers extends User{

    private String item;
    private int idTeacher;

    public Teachers(String name, String surname, int age, String item, int idTeacher) {
        super(name, surname, age);
        this.item = item;
        this.idTeacher = idTeacher;
    }
    public String getItem(){
        return item;
    }


    public int getIdTeacher(){
        return idTeacher;
    }
    public void setItem(String item){
        this.item = item;
    }
    public void setIdTeacher(int idTeacher){
        this.idTeacher = idTeacher;
    }



    @Override
 //переопределние метода
 public String toString() 
 {
     return "Teacher{" + 
     "surname='" + super.getSurname() + '\'' +
     ", name='" + super.getName() + '\'' +
     ", age='" + super.getAge() + '\'' +
     ", item='" + item + '\'' + 
     ", idTeacher='" + idTeacher + 
     '}';
}
    
}
