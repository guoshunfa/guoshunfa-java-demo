package code29;

import java.util.List;

/**
 * @className: StudentDao
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
public interface StudentDao {
    public List<Student> getAllStudents();
    public Student getStudent(int rollNo);
    public void updateStudent(Student student);
    public void deleteStudent(Student student);
}
