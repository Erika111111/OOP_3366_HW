package StudentDomen;

public class Emploee extends User{
    private int empId;

    public Emploee(String name, String surname, int age, int empId) {
        super(name, surname, age);
        this.empId = empId;
       
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    @Override
    public String toString() {
        return "Emploee{" + 
     "surname='" + super.getSurname() + '\'' +
     ", name='" + super.getName() + '\'' +
     ", age='" + super.getAge() + '\'' +
     ", empId='" + empId + 
     '}';
    }
    
}
