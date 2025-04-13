package resumer.smart_resumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class SmartResumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmartResumerApplication.class, args);
	}

	@GetMapping("/root")
	public String Helloworld() {
		return "Hello World";
	}

}
