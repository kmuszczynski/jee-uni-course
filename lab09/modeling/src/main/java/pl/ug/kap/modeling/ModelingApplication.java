package pl.ug.kap.modeling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.ug.kap.modeling.domain.Baker;
import pl.ug.kap.modeling.domain.Bakery;
import pl.ug.kap.modeling.domain.Bread;
import pl.ug.kap.modeling.domain.Label;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SpringBootApplication
public class ModelingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ModelingApplication.class, args);

//		Bakery bakery1 = new Bakery("La Pain", "Pain str. 1, France");
//		Bakery bakery2 = new Bakery("Die Broetchen", "Broetchenstr 3, Germany");
//
//		Baker baker1 = new Baker("Jean Jacquez");
//		Baker baker2 = new Baker("Hanz Muller");
//		Baker baker3 = new Baker("John Not-A-Smith");
//		Baker baker4 = new Baker("Hellen Hellenson");
//		Baker baker5 = new Baker("Jimmy Jimson");
//
//		bakery1.addBakers(baker1, baker2);
//		bakery2.addBakers(baker3, baker4, baker5);
//
//		Label label1 = new Label("water", "flour", "salt");
//		Label label2 = new Label("water", "flour", "salt");
//		Label label3 = new Label("water", "flour", "sugar", "salt", "trace amounts of peanuts");
//		Label label4 = new Label("water", "flour", "sugar", "salt", "trace amounts of peanuts");
//
//		Bread bread1 = new Bread("wheat", "loaf", bakery1, baker1, label1);
////		label1.setBread(bread1);
//		Bread bread2 = new Bread("rye", "loaf", bakery1, baker2, label2);
////		label2.setBread(bread2);
//		Bread bread3 = new Bread("wheat", "bun", bakery2, baker3, label3);
////		label3.setBread(bread3);
//		Bread bread4 = new Bread("barley", "croissant", bakery2, baker3, label4);
////		label4.setBread(bread4);
//
//		List<Bread> breads = new ArrayList<>();
//		Collections.addAll(breads, bread1, bread2, bread3, bread4);
//
//		System.out.println(bread1.getLabel().getBread());
//
//		// Zapytania
//		// 1. Wyświetlić wszystkich piekarzy pracujących w piekarni w której został upieczony dany chleb
//		System.out.println(bread1.getBakery().getBakers());
//
//		// 2. Wyświetlić skład wszystkich chlebów upieczonych przez danego piekarza
//		List<Label> labels = new ArrayList<>();
//		for (Bread b: breads
//			 ) {
//			if (b.getBaker().equals(baker3)) {
//				labels.add(b.getLabel());
//			}
//		}
//		System.out.println(labels);


	}

}
