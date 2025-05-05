package com.example.feedyourpet.animal;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository
        extends JpaRepository<Animal, Long> {
}
