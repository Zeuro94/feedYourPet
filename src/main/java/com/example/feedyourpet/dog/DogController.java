package com.example.feedyourpet.dog;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/dogs")
public class DogController {

    private final DogService dogService;

    public DogController(DogService dogService) {
        this.dogService = dogService;
    }

    @GetMapping
    public List<Dog> getAllDogs() {
        return dogService.getAllDogs();
    }

    @GetMapping("/{id}")
    public Dog getDogById(
            @PathVariable Long id) {
        return dogService.getDogById(id);
    }

    @PostMapping()
    public void addNewDog(
            @RequestBody
            @Valid Dog dog) {
        dogService.addNewDog(dog);
    }

    @PutMapping("/{id}")
    public void updateDogById(
            @PathVariable Long id,
            @RequestBody Dog dog) {
        dogService.updateDogById(id, dog);
    }

    @DeleteMapping("/{id}")
    public void deleteDogById(
            @PathVariable Long id) {
        dogService.deleteDogById(id);
    }
}
