package pe.idat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EfMarcoRevillaTuristaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfMarcoRevillaTuristaApplication.class, args);
	}

}
