package day1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Classname DemoTest
 * @Description TODO
 * @Date 2021/1/19 23:33
 * @Created by 张斌
 */
public class DemoTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(MyConfig.class);
        ctx.refresh();
        TestBean testBean = ctx.getBean(TestBean.class);
        System.out.println(testBean.getName());
    }
}
