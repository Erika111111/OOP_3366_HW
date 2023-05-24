package Task2;
// Переписать код SpeedCalculation в соответствии с Open-Closed Principle:
// public class SpeedCalculation {

// метод расчета разрешенной скорости
// public double calculateAllowedSpeed(Vehicle vehicle) {
// if (vehicle.getType().equalsIgnoreCase("Car")) {
// return vehicle.getMaxSpeed() * 0.8;
// } else if (vehicle.getType().equalsIgnoreCase("Bus")) {
// return vehicle.getMaxSpeed() * 0.6;
// }

//     return 0.0;
// }
// }
// класс транспортное средство
// public class Vehicle {
// поле максимальная скорость
// int maxSpeed;
// поле тип тс
// String type;
//конструктор
// public Vehicle(int maxSpeed, String type) {
// this.maxSpeed = maxSpeed;
// this.type = type;
// }
// метод получения максимальной скорости
// public int getMaxSpeed() {
// return this.maxSpeed;
// }
// метод получения типа тс
// public String getType() {
// return this.type;
// }
// }

// Подсказка: создайте два дополнительных класса Car и Bus(наследников Vehicle), напишите метод calculateAllowedSpeed(). 
// Использование этого метода позволит сделать класс SpeedCalculation соответствующим OCP

//класс SpeedCalculation
public class SpeedCalculation {
   
// метод расчета разрешенной скорости
 public double calculateAllowedSpeed(Vehicle vehicle){

   return vehicle.calculateAllowedSpeed();
}

 }



