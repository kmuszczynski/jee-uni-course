package pl.edu.ug.kap.bakedGoodsCRUD.service;

import pl.edu.ug.kap.bakedGoodsCRUD.domain.Bread;

import java.util.List;
import java.util.Map;

public interface BreadManager {
    Bread addBread(Bread bread);
    Bread findBread(String id);
    Bread updateBread(String id, Bread bread);
    boolean deleteBread(String id);
    List<Bread> getAllBread();
}
