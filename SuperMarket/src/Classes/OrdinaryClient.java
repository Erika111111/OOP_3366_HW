package Classes;
// обычный клиент
public class OrdinaryClient extends Actor{

    public OrdinaryClient(String name)
    {
        super(name);
    }

   
    @Override
    public String getName() {
       
        return super.name;
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
    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
        
    }


    @Override
    public void setTakeOrder(boolean pickUpOrder) {
        super.isTakeOrder = pickUpOrder;
        
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
        return "OrdinaryClient{" + 
       
        ", name= '" + name + '\'' +
        '}';
   }

    
    






    
    
}
