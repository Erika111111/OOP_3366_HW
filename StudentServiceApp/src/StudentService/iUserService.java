package StudentService;

import java.util.List;
// обобщенный интерфейс
public interface iUserService<T> {
    List<T> gelAll();
    void create(String name,String surname, int age);
   
}
