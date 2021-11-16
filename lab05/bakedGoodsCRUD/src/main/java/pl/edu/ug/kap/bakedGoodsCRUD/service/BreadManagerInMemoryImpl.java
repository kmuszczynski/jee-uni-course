package pl.edu.ug.kap.bakedGoodsCRUD.service;

import org.springframework.stereotype.Service;
import pl.edu.ug.kap.bakedGoodsCRUD.domain.Bread;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
public class BreadManagerInMemoryImpl implements BreadManager{
    Map<String, Bread> db = new HashMap<>();

    @Override
    public Bread addBread(Bread bread) {
        Bread breadToAdd = new Bread(bread.getShape(), bread.getType());
        db.put(UUID.randomUUID().toString(), breadToAdd);
        return breadToAdd;
    }

    @Override
    public Bread findBread(String id) {
        return db.get(id);
    }

    @Override
    public Bread updateBread(String id, Bread bread) {
        Bread breadToUpdate = new Bread(bread.getShape(), bread.getType());
        db.replace(id, breadToUpdate);
        return breadToUpdate;
    }

    @Override
    public boolean deleteBread(String id) {
        if(db.containsKey(id)) {
            db.remove(id);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Map<String, Bread> getAllBread() {
        return db;
    }
}
