package com.example.ioc;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author yichuan
 */
@Component
@Slf4j
public class MyComponent {

    public void method1() {
        log.info("method1");
    }
}
