package Classes;
// класс акционного клиента
public class PromoClient extends Actor{
    // название акции
    private String namePromo;
    // номер клиента в акции
    private static int numberClientPromo;

    // конструктор акционного клиента
    // имя покупателя
    // название акции
    // номер клиента в акции
    public PromoClient(String name, String namePromo, int numberClientPromo)
    {
        super(name);
        this.namePromo = namePromo;
        PromoClient.numberClientPromo = 5;
    }
    // метод, позволяющий получить название акции
    public String getNamePromo()
    {
        return namePromo;
    }
    // метод, позволяющий получить номер клиента в акции
    public int getNumberClientPromo()
    {
        return numberClientPromo;
    }


    @Override
    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }

    @Override
    public void setTakeOrder(boolean pickUpOrder) {
        super.isTakeOrder = pickUpOrder;
    }

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    @Override
    public String getName() {
        return super.name;
    }
    

    @Override
    public void setMakeReturnOrder(boolean returnOrder) {
        super.isMakeReturnOrder = returnOrder;
    }
    @Override
    public void setTakeMoney(boolean getMoney) {
        super.isTakeMoney = getMoney;
    }
    @Override
    public boolean isMakeReturnOrder() {
        return super.isMakeReturnOrder;
    }
    @Override
    public boolean isTakeMoney() {
        return super.isTakeMoney;
    }

    @Override
    //переопределние метода
    public String toString() 
    {
        return "PromoClient{" + 
        ", name= '" + super.name + '\'' +
        ", namePromo= '" + namePromo + '\'' +
        ", numberClientPromo= '" + numberClientPromo + '\'' +
        '}';
    }
}
