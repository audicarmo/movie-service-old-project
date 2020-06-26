package com.movie.service;

import com.movie.model.Filme;
import com.movie.repository.FilmeRepository;
import com.movie.service.exception.FilmeInexistenteOuInativoException;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

@Service
public class FilmeService {

    @Autowired
    private FilmeRepository filmeRepository;

    private Filme buscarFilmePeloCodigo(Long codigo) {
        return null;
    }

    public Filme atualizar(Long codigo, Filme filme) {
        Filme filmeSalvo = buscarPessoaPeloCodigo(codigo);

        BeanUtils.copyProperties(filme, filmeSalvo, "codigo");
        return filmeRepository.save(filmeSalvo);
    }

    public void atualizarPropriedadeAtivo(Long codigo, Boolean ativo) {
        Filme filmeSalvo = buscarFilmePeloCodigo(codigo);
        filmeSalvo.setAtivo(ativo);
        filmeRepository.save(filmeSalvo);
    }

    public Filme salvar(Filme filme) {
        filme = filmeRepository.getOne(filme.getFilme(filme).getCodigo());
        if (filme == null || filme.isInativo()) {
            throw new FilmeInexistenteOuInativoException();
        }

        return filmeRepository.save(filme);
    }

    private Filme buscarPessoaPeloCodigo(Long codigo) {
        Filme filmeSalvo = filmeRepository.getOne(codigo);
        if (filmeSalvo == null) {
            throw new EmptyResultDataAccessException(1);
        }
        return filmeSalvo;
    }
}
