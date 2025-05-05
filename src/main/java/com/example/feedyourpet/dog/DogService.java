package com.example.feedyourpet.dog;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DogService {
    private final DogRepository dogRepository;

    public DogService(
            DogRepository dogRepository
    ) {
        this.dogRepository = dogRepository;
    }

    public List<Dog> getAllDogs() {
        return dogRepository.findAll();
    }

    public void addNewDog(Dog dog) {
        dogRepository.save(dog);
    }
}
