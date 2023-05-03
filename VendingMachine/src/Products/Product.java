package Products;


// базовый класс Product
public class Product {
    // наименование продукта
    private String name;
    // цена продукта
    private double price;
    /**
     * конструктор продукта 2 параметра
     * @param name наименование продукта
     * @param price цена продукта
     */
    public Product(String name, double price){
        if(name == ""){
            throw new IllegalStateException(String.format("у продукта отстуствует наименование", name)); // формирование ошибки
        }
        else{
            this.name = name;
            this.price = price;
        }
    
    }

    /**
     * устанавливаем цену продукта
     * @param value новая цена продукта
     */
    public void setPrice(Double value){
        if(value <= 0) {
            throw new IllegalStateException(String.format(" Цена указана некоректно!", value));
        }
        this.price = value;
    }
    /** получаем цену продукта */
    public double getPrise(){
        return price;
    }
    /** получаем наименование продукта */
    public String getName(){
        return name;
    }

    /**
     * переопределение вывода продукта
     */
    @Override
    public String toString() //  переопределение метода
    {
        return "Product{" + 
        "name=" + name + '\'' +
        ", cost=" + price + 
        '}';
    }

    // public Product(String name){
    //     this.name = name;
    // }
}
