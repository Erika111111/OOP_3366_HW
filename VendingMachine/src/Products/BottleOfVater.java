package Products;
// наследование класса Product
public class BottleOfVater extends Product{
    private int value;
    public BottleOfVater(String name, double price, int value)
    {
        super(name, price);
        this.value = value;
    }
    public int getValue(){
        return value;
    }
    public void setValue(int value){
        this.value = value;
    }

    @Override
    public String toString() //переопределние метода
    {
        return "Product{" + 
        "name=" + super.getName() + '\'' +
        ", cost=" + super.getPrise() + 
        ", volu=" + value +
        '}';
    }
}
