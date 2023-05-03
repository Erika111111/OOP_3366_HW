package VendingMachine;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.AbstractDocument.Content;

import Products.Product;

public class VendingMachine {
    private int volue;
    private List<Product> products;
    private List<String> worklog;
    public VendingMachine(int value)
    {
        this.volue = value;
        products = new ArrayList<Product>();
        worklog = new ArrayList<String>();

    }
    public void addProduct(Product prod)
    {
        products.add(prod);
    }

    public void addSales(String line)
    {
        worklog.add(line);
    }

    // public void remainderProduct(int remainder)
    // {
    //     int res = products - worklog;
    //     return res;
    // }
        // возвращает название продукта
    public  Product getProductByName(String name)
    {
        for (Product product: products)
        {
            if(product.getName().contains(name))
            {
                return product;
            }
        }
        return null;

    }
    public List<Product> getProdAll()
    {
        return products;
    }
}
