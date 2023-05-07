package Controller;

import StudentDomen.Emploee;
import StudentDomen.User;
import StudentService.EmploeeService;

public class EmploeeController implements iUserControllers<Emploee>{

    private final EmploeeService empServ = new EmploeeService();

    @Override
    public void create(String name, String surname, int age) {
        empServ.create(name, surname, age); 
    }

     static public <T extends Emploee> void paySalary(T person)
    {
        // преобразование типа в user поэтому берем в скобки
        System.out.println(((User)person).getName() + " выплатити зп 25000");
    }

    static public <T extends Number> Double mean(T[] num) 
    {
        double sum = 0.0;
        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i].doubleValue();
        }
        sum = sum / num.length;
        return sum;
    }
    
}
