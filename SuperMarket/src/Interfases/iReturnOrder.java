package Interfases;
// интерфейс возврата товара
public interface iReturnOrder {
    // клиент сделал заявку на возврат товара
    void setMakeReturnOrder(boolean returnOrder);
    // клиент получил деньги за возврат товара
    void setTakeMoney(boolean getMoney);
    // сделал ли клиент заявку на возврат товара
    boolean isMakeReturnOrder();
    // забрал ли клиент деньги за возврат товара 
    boolean isTakeMoney();
}
