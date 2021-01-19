package day1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Classname DemoTest2
 * @Description TODO
 * @Date 2021/1/19 23:40
 * @Created by 张斌
 */
public class DemoTest2 {

    public static void main(String[] args) {
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("beans.xml");
        TestBean testBean = applicationContext.getBean(TestBean.class);
        System.out.println(testBean.getName());
    }
}
