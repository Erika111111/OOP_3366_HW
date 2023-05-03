package Classes;

import java.util.ArrayList;
import java.util.List;

import Interfases.iMarketBehaviour;
import Interfases.iQueueBehaviour;


public class Market implements iMarketBehaviour, iQueueBehaviour{
    private List<Actor> queue;

    public Market() {
        this.queue = new ArrayList<Actor>();
    }

    // метод подсчета сколько человек пришло в магазин
    @Override
    public void acceptToMarket(Actor actor) { 
        System.out.println(actor.getName() + "клиент пришел в магазин ");
        takeInQueue(actor);
        
    }
    public void takeInQueue(Actor actor) {
         this.queue.add(actor);
         System.out.println(actor.getName() + "клиент добавлен в очередь ");
    }
    // метод подсчета сколько человек ушло из магазина
    @Override
    public void releaseFromMarcet(List<Actor> actors) { 
        for(Actor actor:actors)
        {
            System.out.println(actor.getName() + "клиент ушел из магазина ");
            this.queue.remove(actor);
        }
        
    }
    // обновление
    @Override
    public void update() { 
        takeOrder();
        giveOrder();
        releaseFromQueue();
        
    }
    //  метод подсчета vip клиентов
    public void VipStatus(Actor actor){ 
        System.out.println(actor.getName() + "пришел vip клиент № " );
        this.queue.add(actor);
    }
    // метод подсчета акционных клиентов
    public void NumberPromoClient(Actor actor) { 
        System.out.println(actor.getName() + "пришел акционный клиент № " );
        this.queue.add(actor);
    }

    

    @Override
    public void giveOrder() {
        for(Actor actor: queue)
        {
            if(actor.isMakeOrder())
            {
                actor.setTakeOrder(true); // получить заказ в магазине
                System.out.println(actor.getName() + "клиент получил свой заказ");
            }
        }
        
    }

    @Override
    public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>();
        for(Actor actor:queue)
        {
            if(actor.isTakeOrder())
            {
                releaseActors.add(actor);
                System.out.println(actor.getName() + "клиент ушел из очереди");
            }
        }
        releaseFromMarcet(releaseActors);
    }

   
    

    @Override
    public void takeOrder() {
        for(Actor actor: queue)
        {
            if(!actor.isMakeOrder())
            {
                actor.setMakeOrder(true);
                System.out.println(actor.getName() + "клиент сделал заказ");
            }
        }
        
    } 
}
