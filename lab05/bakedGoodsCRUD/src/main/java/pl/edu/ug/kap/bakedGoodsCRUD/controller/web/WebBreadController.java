package pl.edu.ug.kap.bakedGoodsCRUD.controller.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.edu.ug.kap.bakedGoodsCRUD.domain.Bread;
import pl.edu.ug.kap.bakedGoodsCRUD.service.BreadManager;

import javax.validation.Valid;

@Controller
public class WebBreadController {
    private final BreadManager breadManager;

    public WebBreadController(@Autowired BreadManager breadManager) { this.breadManager = breadManager; }

    @GetMapping("/bread")
    public String allBread(Model model) {
        model.addAttribute("allBreadFromDB", breadManager.getAllBread());

        return "bread-all";
    }

    @GetMapping("/bread/add")
    public String editBread(Model model) {
        model.addAttribute("breadToEdit", new Bread("unknown", "unknown"));
        // Zwraca/przygotowuje widok formularza !
        return "bread-edit";
    }

    @GetMapping("/bread/update/{id}")
    public String updateBread(@PathVariable("id") String id, Model model) {
        System.out.println(id);
        System.out.println(breadManager.findBread(id));
        model.addAttribute("breadToEdit", breadManager.findBread(id));
        return "bread-edit";
    }

    @PostMapping("/bread")
    public String addNewBread(@Valid @ModelAttribute("breadToEdit") Bread breadToAdd, BindingResult bindingResult, Model model){
        if (bindingResult.hasErrors()) {
            System.out.println("Error found in addNew");
            return "bread-edit";
        }
        breadManager.addBread(breadToAdd);
        model.addAttribute("allBreadFromDB", breadManager.getAllBread());
        return "bread-all";
    }

    @PostMapping("/bread/update/{id}")
    public String updateBreadPost(@PathVariable("id") String id, @Valid @ModelAttribute("breadToEdit") Bread breadToUpdate, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            System.out.println("Error found in update");
            return "bread-edit";
        }
        breadManager.updateBread(id, breadToUpdate);
        model.addAttribute("allBreadFromDB", breadManager.getAllBread());
        return "bread-all";
    }

    @GetMapping("/bread/delete/{id}")
    public String deleteBread(@PathVariable("id") String id, Model model) {

        breadManager.deleteBread(id);
        model.addAttribute("allBreadFromDB", breadManager.getAllBread());
        // Zwraca/przygotowuje widok formularza !
        return "bread-all";
    }
}
