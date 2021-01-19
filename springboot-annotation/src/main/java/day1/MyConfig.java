package day1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Classname MyConfig
 * @Description TODO
 * @Date 2021/1/19 23:31
 * @Created by 张斌
 */
@Configuration
public class MyConfig {

    @Bean
    public TestBean testBean() {
        return new TestBean("riant");
    }
    @Bean
    public Horse horse(){
        return new Horse("baima");
    }
    @Bean
    public Knight knight(Horse horse){
        return new Knight("yase",horse);
    }

}
