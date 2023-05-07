package Controller;

import StudentDomen.Teachers;
import StudentService.TeacherService;
//  класс  TeacherController
public class TeacherController implements iUserControllers<Teachers> {
// финальный экземпляр класса TeacherServise
    private final TeacherService servTeach = new TeacherService();

    @Override
    public void create(String name, String surname, int age) {
        servTeach.create(name, surname, age);
    }
    
}
