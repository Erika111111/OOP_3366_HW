package Task2;

// класс  Car наследник Vehicle
public class Car extends Vehicle {

// конструктор
public Car(int maxSpeed) {
        super(maxSpeed); 
    }

// переопределенный метод calculateAllowedSpeed
@Override
public double calculateAllowedSpeed() {
    return super.getMaxSpeed() * 0.8;
    }
    

    }

