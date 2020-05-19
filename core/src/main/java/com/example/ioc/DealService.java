package com.example.ioc;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
/**
 * @Service表示提供控制反转服务
 */
public class DealService {
    public void method1() {
        log.info("method1");
    }
}
