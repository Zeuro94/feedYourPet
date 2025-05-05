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

    public Dog getDogById(Long id) {
        return dogRepository.findById(id)
                .orElseThrow(
                        () -> new RuntimeException("Dog not found for id :: " + id)
                );
    }

    public void addNewDog(Dog dog) {
        dogRepository.save(dog);
    }

    public void updateDogById(Long id, Dog updatedDog) {
        Dog dog = dogRepository.findById(id).orElse(new Dog());
        dog.setColour(updatedDog.getColour());
        dog.setSize(updatedDog.getSize());
        dog.setBreed(updatedDog.getBreed());
        dogRepository.save(dog);
    }

    public void deleteDogById(Long id) {
        boolean exists = dogRepository.existsById(id);
        if (!exists) {
            throw new RuntimeException("Dog not found for id :: " + id);
        }
        dogRepository.deleteById(id);
    }
}
