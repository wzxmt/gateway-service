package org.wangqing.notebookk8s.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableZuulProxy
@RestController
@EnableApolloConfig
public class GatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}

//在微服务应用启动中使用apollo配置中心获取配置信息
public class SpringbootApolloApplication {
　　public static void main(String[] args) {
　　　　SpringApplication.run(SpringbootApolloApplication.class, args);
　　}
}

}
