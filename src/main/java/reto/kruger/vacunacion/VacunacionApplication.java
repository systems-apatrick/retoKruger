package reto.kruger.vacunacion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class VacunacionApplication {

	public static void main(String[] args) {
		SpringApplication.run(VacunacionApplication.class, args);
	}

}
