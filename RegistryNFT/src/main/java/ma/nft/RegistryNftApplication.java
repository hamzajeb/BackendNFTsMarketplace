package ma.nft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class RegistryNftApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistryNftApplication.class, args);
	}

}
