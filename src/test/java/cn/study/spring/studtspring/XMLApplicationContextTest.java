package cn.study.spring.studtspring;

import cn.study.spring.studtspring.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhuQiYun
 * @create 2020/8/25
 * @description :
 */
public class XMLApplicationContextTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-config.xml");
        Student bean = (Student) applicationContext.getBean("student2");
        System.out.println(bean);
    }
}
