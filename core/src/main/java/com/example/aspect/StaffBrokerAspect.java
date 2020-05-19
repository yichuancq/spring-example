package com.example.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author yichuan
 */
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
