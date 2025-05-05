package com.example.feedyourpet.cat;

import com.example.feedyourpet.animal.Animal;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Cat extends Animal {
    private String colour;
    private String breed;
    private String size;
}
