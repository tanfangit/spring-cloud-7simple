package server;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
 

@EnableDiscoveryClient
public class Application {
	 public static void main(String[] args) {
	        SpringApplication.run(Application.class, args);
	    }
}
