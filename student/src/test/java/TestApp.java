import com.tianshu.spring.web.student.beans.Student;
import com.tianshu.spring.web.student.dao.StudentDao;
import com.tianshu.spring.web.student.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestApp {
    @Test
    public void test01(){
        String conf = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(conf);
        StudentDao studentService = (StudentDao) ac.getBean("studentDao");
        List<Student> students = studentService.selectStudents();
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
