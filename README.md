# spring-example
spring-example

- IOC
　Spring IoC 容器的用途：
  
  1）管理对象，包括 创建对象、发布对象、销毁对象等整个生命周期
  
  2）查询对象的依赖关系，注入依赖对象
  
  定义bean
```xml
    <bean id="cityBean"
          class="com.example.domain.City">
    </bean>
```
  获取bean对象
```java
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
```
  
  返回结果
```java
ctx id:org.springframework.context.support.ClassPathXmlApplicationContext@601d9f3a
City(cityId=1, city=重庆沙坪坝, countryId=null, lastUpdate=2020-05-19T22:28:00.349)

```
- AOP
  切面监控，可以监控任何文件，目前普遍用于日志。
  
```java
@Slf4j
@Aspect
@Component
public class StaffBrokerAspect {
    /**
     * 定义切入点，切入点为com.example.controller.StaffController.queryStaffByName
     * 通过@Pointcut注解声明频繁使用的切点表达式
     */
    @Pointcut("execution(public * com.example.controller.StaffController.queryStaffByName(..)))") //声明切面
    public void BrokerAspect() {
    }

    /**
     * @description 在连接点执行之前执行的通知
     */
    @Before("BrokerAspect()")
    public void doBeforeQuery() {
        log.info("queryStaffByName->执行查询前");
    }

    /**
     * @description 在连接点执行之后执行的通知（返回通知和异常通知的异常）
     */
    @After("BrokerAspect()")
    public void doAfterQuery() {
        log.info("queryStaffByName->执行查询后");
    }

}
```