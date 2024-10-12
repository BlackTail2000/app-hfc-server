package pe.edu.cibertec.app_hfc_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class AppHfcServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppHfcServerApplication.class, args);
	}

}
