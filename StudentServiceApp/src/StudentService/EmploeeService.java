package StudentService;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Emploee;
import StudentDomen.UserComporator;

public class EmploeeService implements iUserService<Emploee>{
    private int count;
    private List<Emploee> emploes;

public EmploeeService() {
    this.emploes = new ArrayList<Emploee>();
}

@Override
// создать
public void create(String name, String surname, int age) {
    Emploee per = new Emploee(name, surname, age, count);
    count++;
    emploes.add(per);
    
}
// метод вывода всех работников
@Override
public List<Emploee> gelAll() {
    
    return emploes;
}

public List <Emploee> getSortedByFIOStudentGroup(int getNumberGroup)
    {
        List<Emploee> empl = new ArrayList<>(emploes);
        empl.sort(new UserComporator<Emploee>());
        return empl;
    }
}
