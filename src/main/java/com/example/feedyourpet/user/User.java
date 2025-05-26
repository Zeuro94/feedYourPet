package com.example.feedyourpet.user;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "app_user")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(unique = true)
    private String username;

    @Pattern(regexp = "^(?=.*[A-Z])(?=.*[!@#$%^&*()_+\\-={}\\[\\]:;\"'|<>,.?/~`]).{8,}$",
            message = "Parola trebuie să aibă cel puțin 8 caractere, o literă mare și un caracter special")
    @Column(nullable = false)
    private String password;


    @Column(unique = true)
    @Email
    private String email;

    @Column(unique = true)
    @Pattern(regexp = "\\d{10}", message = "Numărul de telefon trebuie să aibă 10 cifre")
    private String phoneNumber;
    private String preferredNotificationMethod;
}
