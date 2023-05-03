import Classes.Market;
import Classes.OrdinaryClient;
import Classes.PromoClient;
import Classes.VipClient;

public class App {
    public static void main(String[] args) throws Exception {
       Market market = new Market();
       OrdinaryClient client1 = new OrdinaryClient("Andrey ");
       OrdinaryClient client2 = new OrdinaryClient("Cergey ");
       VipClient client3 = new VipClient("Irina ", 123);
       PromoClient clien4 = new PromoClient("Olga ", "2=1", 3);
       market.acceptToMarket(client1);
       market.acceptToMarket(client2);
       market.VipStatus(client3);
       market.NumberPromoClient(clien4);
       market.update();
    }
}
