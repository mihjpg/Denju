package com.denju.denju.controller;

import com.denju.denju.dto.UserRequestDTO;
import com.denju.denju.dto.UserResponseDTO;
import com.denju.denju.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<UserResponseDTO> criarUsuario(@RequestBody UserRequestDTO request) {

        UserResponseDTO response = userService.criarUsuario(request);

        return ResponseEntity.ok(response);
    }
}
