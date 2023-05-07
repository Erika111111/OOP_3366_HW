package Controller;

import StudentDomen.User;
//  интерфейс (джейнерик работающий только с User  и его потомками)
public interface iUserControllers<T extends User> {
    void create(String name, String surname, int age);
    
}
