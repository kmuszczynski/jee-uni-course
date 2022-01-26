package pl.ug.kap.upload.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import pl.ug.kap.upload.storage.StorageFileNotFoundException;
import pl.ug.kap.upload.storage.StorageService;

import java.io.IOException;
import java.util.stream.Collectors;

@Controller
public class UploadController {

    /** Home */
    private final StorageService storageService;

    @Autowired
    public UploadController(StorageService storageService) {
        this.storageService = storageService;
    }

    @GetMapping("/")
    public String home(Model model) {
        return "home";
    }

    /** Sum */
    @PostMapping("/sum")
    public String sumUpload(@RequestParam("file") MultipartFile file,
                                   RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("message",
                "sum: " + storageService.sum(file));

        return "redirect:/";
    }


    /** Example */
    @GetMapping("/example")
    public String listUploadedFiles(Model model) throws IOException {
        model.addAttribute("allFIles", storageService.loadAll().collect(Collectors.toList()));
        return "exampleForm";
    }

    @GetMapping("/files/{filename:.+}")
    @ResponseBody
    public ResponseEntity<Resource> serveFile(@PathVariable String filename) {

        Resource file = storageService.loadAsResource(filename);
        return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION,
                "attachment; filename=\"" + file.getFilename() + "\"").body(file);
    }

    @PostMapping("/example")
    public String handleFileUpload(@RequestParam("file") MultipartFile file,
                                   RedirectAttributes redirectAttributes) {

        storageService.store(file);
        redirectAttributes.addFlashAttribute("message",
                "You successfully uploaded " + file.getOriginalFilename() + "!");

        return "redirect:/";
    }

    @ExceptionHandler(StorageFileNotFoundException.class)
    public ResponseEntity<?> handleStorageFileNotFound(StorageFileNotFoundException exc) {
        return ResponseEntity.notFound().build();
    }
}
