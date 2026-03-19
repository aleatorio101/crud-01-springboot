
package com.example.entity;

import jakarta.persistence.*;

@Entity
@Table(name="tb_livro")
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
private String autor;
private Integer anoPublicacao;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
}
