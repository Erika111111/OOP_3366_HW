// класс Calculator имплементирует интерфейс iCalculable
public class Calculator implements iCalculable{

// приватное поле начальное значение
    private ComplexNumber primaryArg;

// конструктор
    public Calculator(ComplexNumber primaryArg) {
        this.primaryArg = primaryArg;
    }

// перегрузка метода сложения
    @Override
    public iCalculable sum(ComplexNumber arg) {
       primaryArg.realNumber += arg.realNumber;
       primaryArg.imaginaryNumber += arg.imaginaryNumber;
        
    }
// перегрузка метода умножения
    @Override
    public iCalculable multi(ComplexNumber arg) {
        ComplexNumber resultM = new ComplexNumber(0, 0);
        resultM.realNumber = primaryArg.realNumber * arg.realNumber ;
        resultM.imaginaryNumber = + primaryArg.imaginaryNumber * arg.imaginaryNumber;
        primaryArg.realNumber = resultM.realNumber;
        primaryArg.imaginaryNumber = resultM.imaginaryNumber;
        return this;
    }

// перегрузка метода получения результата
    @Override
    public int getResult() {
       return primaryArg;
    }

    
    }
