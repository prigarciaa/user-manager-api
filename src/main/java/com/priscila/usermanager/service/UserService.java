package com.priscila.usermanager.service;

import com.priscila.usermanager.model.User;
import com.priscila.usermanager.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    // CREATE
    public User create(User user) {
        return repository.save(user);
    }

    // READ - LIST
    public List<User> findAll() {
        return repository.findAll();
    }

    // READ - BY ID
    public User findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
    }

    // UPDATE
    public User update(Long id, User user) {
        User existing = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

        existing.setNome(user.getNome());
        existing.setEmail(user.getEmail());

        return repository.save(existing);
    }

    //DELETE
    public void delete(Long id) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("Usuário não encontrado");
        }
        repository.deleteById(id);
    }
}
