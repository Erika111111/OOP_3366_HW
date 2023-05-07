package StudentService;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.UserComporator;

public class StudentGroupService {
    
    private List<StudentGroup> groups;

    public StudentGroupService() {
        this.groups = new ArrayList<StudentGroup>();
    }
    // метод вывода всех групп
    public List<StudentGroup> getAll()
    {
        return groups;
    }

    public List <Student> getSortedByFIOStudentGroup(int getNumberGroup)
    {
        List<Student> students = new ArrayList<>(groups.get(getNumberGroup).getStudents());
        students.sort(new UserComporator<Student>());
        return students;
    }
    
}
