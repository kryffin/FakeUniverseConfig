package fr.univlorraine.FakeUniverseConfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class FakeUniverseConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(FakeUniverseConfigApplication.class, args);
	}

}
