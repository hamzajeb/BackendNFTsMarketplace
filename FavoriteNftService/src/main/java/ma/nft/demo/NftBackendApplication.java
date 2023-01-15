package ma.nft.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories("ma.nft.repository")
@EntityScan("ma.fstt.entities")
@ComponentScan(basePackages = "ma.nft.services "
		+ "ma.nft.restcontroller")

public class NftBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(NftBackendApplication.class, args);
	}
 
	
}
