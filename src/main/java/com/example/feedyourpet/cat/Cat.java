package com.example.feedyourpet.cat;

import com.example.feedyourpet.animal.Animal;
import com.example.feedyourpet.validation.PetSize;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Cat extends Animal {
    private String colour;
    private String breed;
    @PetSize
    private String size;
}
