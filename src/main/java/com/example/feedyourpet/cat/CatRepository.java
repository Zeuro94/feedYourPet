package com.example.feedyourpet.cat;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CatRepository
        extends JpaRepository<Cat, Long> {
}
