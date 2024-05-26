package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudGateWayApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudGateWayApplication.class, args);
	}
	
	@Bean
	  public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
	  return builder.routes()
	    .route("NameService", r -> r.path("/nameservice/**")
	      .filters(f -> f.stripPrefix(0))
	      .uri("lb://NameService"))
	    .route("StudentService", r -> r.path("/student/**")
	      .filters(f -> f.stripPrefix(0))
	      .uri("lb://StudentService"))
	    .build();
	  }

}
