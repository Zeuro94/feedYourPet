package com.example.feedYourPet.cat;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CatRepository
        extends JpaRepository<Cat, Long> {
}
