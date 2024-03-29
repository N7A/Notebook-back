package fr.n74projects.api.smartfridge.notebook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("fr.n74projects.api.smartfridge.notebook.models.entities")
@ComponentScan({ "fr.n74projects.api.smartfridge.notebook" })
@EnableJpaRepositories(basePackages = { "fr.n74projects.api.smartfridge.notebook.ports.out" })
public class NotebookApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotebookApplication.class, args);
	}

}
