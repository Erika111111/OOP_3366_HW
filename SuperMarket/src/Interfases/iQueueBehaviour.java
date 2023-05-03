package Interfases;

import Classes.Actor;
//  интерфейс поведение в очереди
public interface iQueueBehaviour { 
    
    void takeInQueue(Actor actor); // попасть в очередь
    void releaseFromQueue(); // ушел с очереди
    void takeOrder(); // забрать заказ
    void giveOrder(); // сделать заказ

}
