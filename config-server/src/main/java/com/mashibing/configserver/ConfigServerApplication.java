package com.mashibing.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author gangquan.hu
 * @Package: com.mashibing.configserver.ConfigServerApplication
 * @Description: 配置中心启动类
 * @date 2020/8/17 14:42
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigServerApplication {

  public static void main(String[] args) {
    SpringApplication.run(ConfigServerApplication.class,args);
  }

}
