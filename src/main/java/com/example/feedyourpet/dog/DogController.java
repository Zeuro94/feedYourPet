package com.example.feedyourpet.dog;

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

    @PostMapping()
    public void addNewDog(
            @RequestBody Dog dog
    ) {
        dogService.addNewDog(dog);
    }
}
