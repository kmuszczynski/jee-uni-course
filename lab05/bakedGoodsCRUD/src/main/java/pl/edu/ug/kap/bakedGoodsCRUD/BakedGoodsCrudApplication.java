package pl.edu.ug.kap.bakedGoodsCRUD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.edu.ug.kap.bakedGoodsCRUD.domain.Bread;

@SpringBootApplication
public class BakedGoodsCrudApplication {

	public static void main(String[] args) {

		SpringApplication.run(BakedGoodsCrudApplication.class, args);

		System.out.println(new Bread("unknown", "unknown"));
	}

}
