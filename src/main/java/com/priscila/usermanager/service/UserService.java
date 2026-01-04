package com.priscila.usermanager.service;

import com.priscila.usermanager.dto.UserRequestDTO;
import com.priscila.usermanager.dto.UserResponseDTO;
import com.priscila.usermanager.model.User;
import com.priscila.usermanager.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

import com.priscila.usermanager.exception.ResourceNotFoundException;


@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    // CREATE
    public UserResponseDTO create(UserRequestDTO dto) {
        User user = toEntity(dto);
        User saved = repository.save(user);
        return toResponseDTO(saved);
    }

    // READ - LIST
    public List<UserResponseDTO> findAll() {
        return repository.findAll()
                .stream()
                .map(this::toResponseDTO)
                .toList();
    }

    // READ - BY ID
    public UserResponseDTO findById(Long id) {
        User user = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Usuário não encontrado"));
        return toResponseDTO(user);
    }

    // UPDATE
    public UserResponseDTO update(Long id, UserRequestDTO dto) {
        User existing = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Usuário não encontrado"));

        existing.setNome(dto.getNome());
        existing.setEmail(dto.getEmail());

        return toResponseDTO(repository.save(existing));
    }

    //DELETE
    public void delete(Long id) {
        User user = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Usuário não encontrado"));

        repository.delete(user);
    }


    // ===== MÉTODOS AUXILIARES (MAPPERS) =====

    private User toEntity(UserRequestDTO dto) {
        User user = new User();
        user.setNome(dto.getNome());
        user.setEmail(dto.getEmail());
        return user;
    }

    private UserResponseDTO toResponseDTO(User user) {
        return new UserResponseDTO(
                user.getId(),
                user.getNome(),
                user.getEmail()
        );
    }
}

