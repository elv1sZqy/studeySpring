package cn.study.spring.studtspring.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhuQiYun
 * @create 2020/8/25
 * @description :
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student extends Person {
    private Teacher teacher;

    public Teacher getTeacher() {
        return this.teacher;
    }

    public void setTeacher(final Teacher teacher) {
        this.teacher = teacher;
    }

    public Student(final String name, final int age) {
        super(name, age);
    }

    public void initMethod() {
        System.out.println("初始化方法");
    }

    public void destroyMethod() {
        System.out.println("销毁方法");
    }
}
