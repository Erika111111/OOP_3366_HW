package Task2;

// класс Bus наследник Vehicle
public class Bus extends Vehicle{
// конструктор
public Bus(int maxSpeed) {
    super(maxSpeed);      
   }

// переопределенный метод calculateAllowedSpeed
@Override
public double calculateAllowedSpeed() {
    return super.getMaxSpeed() * 0.6;
}

    

    
    
}
