

import Products.BottleOfVater;
import Products.HotDrink;
import Products.Product;
import VendingMachine.VendingMachine;

public class App {
    public static void main(String[] args) throws Exception {

        Product item1 = new Product("cola", 88.0);
        item1.setPrice(98.0);

        VendingMachine itemMachin = new VendingMachine(300);
        itemMachin.addProduct(item1);
        itemMachin.addProduct(new Product("Чипсы", 60.0));
        itemMachin.addProduct(new Product("Масло", 50.0));
        itemMachin.addProduct(new Product("Хлеб", 40.0));
        itemMachin.addProduct(new Product("Снек", 30.0));
        itemMachin.addProduct(new BottleOfVater("Вода", 90.0, 500));
        itemMachin.addProduct(new BottleOfVater("Холодный чай", 180.0, 1500));
        itemMachin.addProduct(new HotDrink("Какао", 150.0, 80));
        itemMachin.addProduct(new HotDrink("Капучино", 200, 90));
        itemMachin.addProduct(new HotDrink("Горячий чай", 100.0, 100));
        for(Product product: itemMachin.getProdAll())
        {
            System.out.println(product.toString());
        }



        
    }
}
