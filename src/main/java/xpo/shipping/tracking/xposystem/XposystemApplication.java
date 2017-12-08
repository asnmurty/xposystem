package xpo.shipping.tracking.xposystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("xpo.shipping.tracking")
public class XposystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(XposystemApplication.class, args);
	}
}
