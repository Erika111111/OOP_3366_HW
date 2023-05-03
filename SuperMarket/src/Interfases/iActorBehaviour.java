package Interfases;
// интерфейс очереди клиентов
public interface iActorBehaviour {
    void setMakeOrder(boolean makeOrder); // сделан заказ
    void setTakeOrder(boolean pickUpOrder); // получен заказ
    boolean isMakeOrder(); //сделан ли заказ
    boolean isTakeOrder(); // получен ли  заказ

    
}
