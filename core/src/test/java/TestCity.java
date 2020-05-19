import com.example.MyApplication;
import com.example.config.CityConfiguration;
import com.example.domain.City;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.time.LocalDateTime;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MyApplication.class)

public class TestCity {


    @Test
    public void testBean() {
        ApplicationContext context = new AnnotationConfigApplicationContext(CityConfiguration.class);
        City city = (City) context.getBean("cityBean");
        city.setCityId(1);
        city.setLastUpdate(LocalDateTime.now());
        city.setCity("重庆沙坪坝");
        System.out.println(city.toString());
    }


    @Test
    public void getCityBean() {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "city.xml");
        System.out.println("ctx id:" + context.getId());
        //通过beanId 获取
        City city = context.getBean("cityBean", City.class);
        city.setCityId(1);
        city.setLastUpdate(LocalDateTime.now());
        city.setCity("重庆沙坪坝");
        System.out.println(city.toString());

    }
}
