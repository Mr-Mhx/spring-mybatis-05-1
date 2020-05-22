import com.bdqn.entity.Students;
import com.bdqn.service.StudentService;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@ContextConfiguration(value = "classpath:applictionContext.xml")
public class T {

    @Resource
    private StudentService studentService;

    @Test
    public void queryStuAll() {
        PageInfo<Students> students = studentService.queryStuAll(2);
        students.getList().forEach( stu ->{
            System.out.println("姓名 :" + stu.getName());
        });

        System.out.println("总条数：" + students.getTotal());
        System.out.println("总页数：" + students.getPages());
        System.out.println("当前页：" + students.getPageNum());
        System.out.println("每页显示条数：" + students.getPageSize());
    }

    @Test
    public void deleteStuById() {
//        测试事务 Rollback
        studentService.deleteStuById(4L);

    }
}
