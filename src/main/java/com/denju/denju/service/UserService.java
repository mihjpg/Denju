package com.denju.denju.service;

import com.denju.denju.dto.UserRequestDTO;
import com.denju.denju.dto.UserResponseDTO;
import lombok.RequiredArgsConstructor;
import com.denju.denju.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.denju.denju.entities.Usuario;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserResponseDTO criarUsuario(UserRequestDTO request) {
        Usuario usuario = Usuario.builder()
                .nome(request.nome())
                .senha(passwordEncoder.encode(request.senha()))
                .build();

        Usuario salvo = userRepository.save(usuario);

        return new UserResponseDTO(salvo.getId(), salvo.getNome());
    }
}
