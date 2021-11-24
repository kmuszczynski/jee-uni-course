package pl.edu.ug.kap.bakedGoodsCRUD.service;

import org.springframework.stereotype.Service;
import pl.edu.ug.kap.bakedGoodsCRUD.domain.Bread;

import java.util.*;

@Service
public class BreadManagerInMemoryImpl implements BreadManager{
    Map<String, Bread> db = new HashMap<>();

    @Override
    public Bread addBread(Bread bread) {
        String id = UUID.randomUUID().toString();
        Bread breadToAdd = new Bread(id, bread.getShape(), bread.getType());
        db.put(id, breadToAdd);
        return breadToAdd;
    }

    @Override
    public Bread findBread(String id) {
        return db.get(id);
    }

    @Override
    public Bread updateBread(String id, Bread bread) {
        Bread breadToUpdate = new Bread(id, bread.getShape(), bread.getType());
        db.replace(id, breadToUpdate);
        return breadToUpdate;
    }

    @Override
    public boolean deleteBread(String id) {
        if(db.containsKey(id)) {
            db.remove(id);
            return true;
        }
        return false;
    }

    @Override
    public List<Bread> getAllBread() {
        List<Bread> allBread = new ArrayList<>(db.values());
        return allBread;
    }
}
