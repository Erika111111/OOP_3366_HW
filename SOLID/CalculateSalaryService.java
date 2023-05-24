public class CalculateSalaryService {
//зп
private int baseSalary;
//конструктор
public CalculateSalaryService(int baseSalary){
    this.baseSalary = baseSalary;
}
//метод расчета заработной платы
 public int calculateNetSalary() {
 int tax = (int) (baseSalary * 0.25);
 return baseSalary - tax;
 }
}
