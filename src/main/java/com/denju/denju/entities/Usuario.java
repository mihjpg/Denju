package com.denju.denju.entities;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "usuarios")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "senha")
    private String senha;
}