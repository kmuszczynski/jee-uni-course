package ug.kap.tje.lab04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import ug.kap.tje.lab04.service.PersonManagerService;

@SpringBootApplication
@ImportResource("classpath:beans.xml")
public class Lab04Application {

	public static void main(String[] args) {
		System.out.println("Right before Application.run()");

		ApplicationContext applicationContext = SpringApplication.run(Lab04Application.class, args);

		System.out.println("Right after Application.run()");

		//Service
//		PersonManagerService personManagerService = applicationContext.getBean(PersonManagerService.class);
//		System.out.println(personManagerService.getPrezes().getFirstName());
//		System.out.println(personManagerService.getWiceprezes().getFirstName());
//		System.out.println(personManagerService.getSekretarka().getFirstName());

//		System.out.println(applicationContext.getBean("prezes"));
		//This one does not work if the block above is not run
		//Beans from the services are not directly accessible from the ApplicationContext
		//XML

		System.out.println(applicationContext.getBean("jillian"));
	}

}
