import com.example.MyApplication;
import com.example.ioc.DealService;
import com.example.ioc.MyComponent;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MyApplication.class)
public class TestService {

    @Autowired
    private DealService dealService;
    @Autowired
    private MyComponent myComponent;

    @Test
    public void testDeal() {
        dealService.method1();
    }

    @Test
    public void testComponent() {
        myComponent.method1();
    }
}
