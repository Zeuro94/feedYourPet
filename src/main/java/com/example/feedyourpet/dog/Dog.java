package com.example.feedyourpet.dog;

import com.example.feedyourpet.animal.Animal;
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
    private String size;
    private String breed;

}
