package pl.ug.kap.modeling.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.ug.kap.modeling.domain.Baker;
import pl.ug.kap.modeling.domain.Bakery;
import pl.ug.kap.modeling.domain.Bread;
import pl.ug.kap.modeling.domain.Label;
import pl.ug.kap.modeling.repository.BakerRepository;
import pl.ug.kap.modeling.repository.BakeryRepository;
import pl.ug.kap.modeling.repository.BreadRepository;
import pl.ug.kap.modeling.repository.LabelRepository;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class BreadService {

    private final BreadRepository breadRepository;
    private final BakerRepository bakerRepository;
    private final BakeryRepository bakeryRepository;
    private final LabelRepository labelRepository;

    @Autowired
    public BreadService(BreadRepository breadRepository, BakerRepository bakerRepository, BakeryRepository bakeryRepository, LabelRepository labelRepository) {
        this.breadRepository = breadRepository;
        this.bakerRepository = bakerRepository;
        this.bakeryRepository = bakeryRepository;
        this.labelRepository = labelRepository;
    }

    public Bread addBread(Bread bread) {return breadRepository.save(bread);}

    public Iterable<Bread> allBread() {return breadRepository.findAll();}

    public void learningBasics() {

		Bakery bakery1 = new Bakery("La Pain", "Pain str. 1, France");
		Bakery bakery2 = new Bakery("Die Broetchen", "Broetchenstr 3, Germany");

		bakeryRepository.save(bakery1);
		bakeryRepository.save(bakery2);

		Baker baker1 = new Baker("Jean Jacquez");
		Baker baker2 = new Baker("Hanz Muller");
		Baker baker3 = new Baker("John Not-A-Smith");
		Baker baker4 = new Baker("Hellen Hellenson");
		Baker baker5 = new Baker("Jimmy Jimson");

		List<Baker> bakerList = new ArrayList<>();
		bakerList.add(baker1);
		bakerList.add(baker2);
		bakerList.add(baker3);
		bakerList.add(baker4);
		bakerList.add(baker5);

		bakerRepository.saveAll(bakerList);

		bakery1.addBakers(baker1, baker2);
		bakery2.addBakers(baker3, baker4, baker5);

		Label label1 = new Label("water, flour, salt");
		Label label2 = new Label("water, flour, salt");
		Label label3 = new Label("water, flour, sugar, salt, trace amounts of peanuts");
		Label label4 = new Label("water, flour, sugar, salt, trace amounts of peanuts");

		labelRepository.save(label1);
		labelRepository.save(label2);
		labelRepository.save(label3);
		labelRepository.save(label4);

		Bread bread1 = new Bread("wheat", "loaf", bakery1, baker1, label1);
//		label1.setBread(bread1);
		Bread bread2 = new Bread("rye", "loaf", bakery1, baker2, label2);
//		label2.setBread(bread2);
		Bread bread3 = new Bread("wheat", "bun", bakery2, baker3, label3);
//		label3.setBread(bread3);
		Bread bread4 = new Bread("barley", "croissant", bakery2, baker3, label4);
//		label4.setBread(bread4);

		breadRepository.save(bread1);
		breadRepository.save(bread2);
		breadRepository.save(bread3);
		breadRepository.save(bread4);
    }
}
