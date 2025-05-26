package com.example.feedyourpet.dog;

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
public class Dog extends Animal {
    private String colour;
    @PetSize
    private String size;
    private String breed;

}
