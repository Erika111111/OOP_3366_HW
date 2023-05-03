package Classes;

public class VipClient extends Actor{
    
    private int id;

    
    public VipClient(String name, int id)
    {
        super(name);
        this.id = id;
    }

    @Override
    public String getName() {
      
        return super.name;
    }

  
    public int getVipStatus() 
    {
        return id;
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
        return "VipClient{" + 
        ", name= '" + super.name + '\'' +
        ", id= '" + id + '\'' +
        '}';
    }
    
}
