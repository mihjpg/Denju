package com.denju.denju.service;

import com.denju.denju.dto.UserRequestDTO;
import com.denju.denju.dto.UserResponseDTO;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private Long contadorId = 1L;

    public UserResponseDTO criarUsuario(UserRequestDTO request) {

        UserResponseDTO response =
                new UserResponseDTO(contadorId, request.getNome());

        contadorId++;

        return response;
    }
}
