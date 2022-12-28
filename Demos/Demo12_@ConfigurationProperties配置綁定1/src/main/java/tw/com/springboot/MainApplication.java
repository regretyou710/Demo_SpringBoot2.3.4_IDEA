package tw.com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import tw.com.springboot.bean.Car;

@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        //返回IOC容器
        ConfigurableApplicationContext ioc = SpringApplication.run(MainApplication.class, args);

        System.out.println(ioc.getBean("car", Car.class).getBrand());
    }
}
