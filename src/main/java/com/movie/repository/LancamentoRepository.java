package com.movie.repository;

import com.movie.model.Lancamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {

}
