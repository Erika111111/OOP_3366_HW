// Базовое задние:
// 1) Переписать код в соответствии с Single Responsibility Principle:
// public class Employee {
// private String name; // имя
// private Date dob; // дата рождения
// private int baseSalary; // зп
// public Employee(String name, Date dob, int baseSalary) {
// this.name = name; 
// this.dob = dob;
// this.baseSalary = baseSalary;
// }
// метод получения информации о работнике
// public String getEmpInfo() {
// return "name - " + name + " , dob - " + dob.toString();
// }
// метод расчета заработной плаиы
// public int calculateNetSalary() {
// int tax = (int) (baseSalary * 0.25);//calculate in otherway
// return baseSalary - tax;
// }
// }
// Подсказка: вынесите метод calculateNetSalary() в отдельный класс

import java.sql.Date;

public class Emploee {
// имя
 private String name; 
 // дата рождения
 private Date dob; 
 // конструктор
 public Emploee(String name, Date bod){
    this.name = name; 
    this.dob = bod;
 }
 // метод получения информации о работнике
 public String getEmpInfo() {
 return "name - " + name + " , dob - " + dob.toString();
 }
}

