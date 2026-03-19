
package com.example.service;

import com.example.entity.Livro;
import com.example.repository.LivroRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class LivroService {

    private final LivroRepository repository;

    public LivroService(LivroRepository repository) {
        this.repository = repository;
    }

    public Livro save(Livro obj) {
        return repository.save(obj);
    }

    public List<Livro> findAll() {
        return repository.findAll();
    }

    public Optional<Livro> findById(Long id) {
        return repository.findById(id);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
