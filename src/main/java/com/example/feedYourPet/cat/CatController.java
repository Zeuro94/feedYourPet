package com.example.feedYourPet.cat;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/cats")
public class CatController {

    private final CatService catService;

    public CatController(CatService catService) {
        this.catService = catService;
    }

    @GetMapping
    public List<Cat> getAllCats() {
        return catService.getAllCats();
    }

    @GetMapping("/{id}")
    public Cat getCatById(
            @PathVariable Long id) {
        return catService.getCatById(id);
    }

    @PostMapping
    public void addNewCat(
            @RequestBody Cat cat) {
        catService.addNewCat(cat);
    }

    @PutMapping("/{id}")
    public void updateCatById(
            @PathVariable Long id,
            @RequestBody Cat cat) {
        catService.updateCatById(id, cat);
    }

    @DeleteMapping("/{id}")
    public void deleteCatById(
            @PathVariable Long id) {
        catService.deleteCatById(id);
    }
}
