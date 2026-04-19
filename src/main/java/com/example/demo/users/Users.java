package com.example.demo.users;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Table(name="users")
@Data
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message="Required name")
    private String name;

    @NotBlank(message = "Required email")
    @Email(message = "Invalid email")
    private String email;

    @NotBlank(message = "Required password")
    private String password;
    private boolean premium;
}
