package StudentDomen;

import java.util.Comparator;
// обобщенный класс UserComporator
public class UserComporator<T extends User> implements Comparator<T>{

    @Override
//   (встроенный  в Comparator) метод для сравнения двух юсеров: студентов или учителей
    public int compare(T o1, T o2) {
        int resultOfComparing = o1.getName().compareTo(o2.getName());
        if(resultOfComparing == 0){
            resultOfComparing = o1.getSurname().compareTo(o2.getSurname());
            return resultOfComparing;
        }
        else
        {
            return resultOfComparing;
        }
    }
    
}
