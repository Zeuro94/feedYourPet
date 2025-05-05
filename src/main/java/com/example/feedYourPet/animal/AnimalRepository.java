package com.example.feedYourPet.animal;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository
        extends JpaRepository<Animal, Long> {
}
