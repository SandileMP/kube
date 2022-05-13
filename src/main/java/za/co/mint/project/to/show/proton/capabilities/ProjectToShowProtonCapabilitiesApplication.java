package za.co.mint.project.to.show.proton.capabilities;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;

@SpringBootApplication
@RestController
public class ProjectToShowProtonCapabilitiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectToShowProtonCapabilitiesApplication.class, args);
	}
	@GetMapping("/test")
	public String testService(){
		return "Services up"+ LocalDateTime.now().toString();
	}

}
