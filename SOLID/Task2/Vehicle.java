package Task2;

// абстрактный класс транспортное средство
public abstract class Vehicle {
// поле максимальная скорость
int maxSpeed;
    
//конструктор
public Vehicle(int maxSpeed) {
this.maxSpeed = maxSpeed;
 }

// метод получения максимальной скорости
public int getMaxSpeed() {
    return this.maxSpeed;
}
    
// абстрактный метод расчета разрешенной скорости
public abstract double calculateAllowedSpeed();

 }
    

    

