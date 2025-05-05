package com.example.feedYourPet.dog;

import com.example.feedYourPet.animal.Animal;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Dog extends Animal {
    private String colour;
    private String size;
    private String breed;

}
