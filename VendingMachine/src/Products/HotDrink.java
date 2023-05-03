package Products;
// наследование класса
public class HotDrink extends Product{
    private int temperature;
    // конструктор
    public HotDrink (String name, double price, int temperature)
    {
        super(name, price);
        this.temperature = temperature;
    }
    public int getTemp(){
        return temperature;
    }
    // устанавливает температуру
    public void setTemp(){
        this.temperature = temperature;
    }


    @Override
    public String toString() //  переопределение метода
    {
        return "Product{" + 
        "name=" + super.getName() + '\'' +
        ", cost=" + super.getPrise() + 
        ", temp=" + temperature +
        '}';
    }
}
