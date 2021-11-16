package pl.edu.ug.kap.bakedGoodsCRUD.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.edu.ug.kap.bakedGoodsCRUD.domain.Bread;
import pl.edu.ug.kap.bakedGoodsCRUD.service.BreadManager;

import java.util.Map;

@RestController
public class BreadController {
    private final BreadManager breadManager;

    public BreadController(@Autowired BreadManager breadManager) { this.breadManager = breadManager; }

    @PostMapping("/api/bread")
    Bread addBread(@RequestBody Bread bread) { return breadManager.addBread(bread); }

    @GetMapping("/api/bread")
    Map<String, Bread> getAllBread() { return breadManager.getAllBread(); }

    @GetMapping("/api/bread/{id}")
    Bread findBread(@PathVariable String id) { return breadManager.findBread(id); }

    @PutMapping("/api/bread/{id}")
    Bread updateBread(@PathVariable String id, @RequestBody Bread bread) { return breadManager.updateBread(id, bread); }

    @DeleteMapping("/api/bread/{id}")
    boolean deleteBread(@PathVariable String id) { return breadManager.deleteBread(id); }

}
