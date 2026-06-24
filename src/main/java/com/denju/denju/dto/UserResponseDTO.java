package com.denju.denju.dto;

public class UserResponseDTO {

    private Long id;
    private String nome;

    public UserResponseDTO(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}

