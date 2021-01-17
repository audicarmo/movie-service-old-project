package com.movie.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "filme")
public class Filme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @NotNull
    private String nome;

    @NotNull
    private Boolean ativo;
    private String filme;

    public Long getCodigo() {
        return codigo;
    }

    public boolean isInativo() {
        return isInativo();
    }

    public Filme getFilme(Filme filme) {
        return filme;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }
}
