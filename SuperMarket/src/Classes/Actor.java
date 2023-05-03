package Classes;

import Interfases.iActorBehaviour;
import Interfases.iReturnOrder;

// абстрактный класс
public abstract class Actor implements iActorBehaviour, iReturnOrder{
    
    protected String name;
    // взять заказ
    protected boolean isTakeOrder; 
    // сделать заказ
    protected boolean isMakeOrder; 
    // сделал ли клиент заявку на возврат товара
    protected boolean isMakeReturnOrder; 
    // забрал ли клиент деньги
    protected boolean isTakeMoney; 
   
    
    
    // конструктор
    public Actor(String name) {
        this.name = name;
    }
    public  abstract String getName(); // при указании абстрактного метода содержание писать не надо. Просто обьявляется метод.
    // public abstract int getVipStatus();
    // public abstract String getNamePromo();
    // public abstract int getNumberClientPromo();

    
    @Override
 //переопределние метода
 public String toString() 
 {
     return "Actor{" + 
     "name= '" + name + '\'' +
     '}';
}
}
