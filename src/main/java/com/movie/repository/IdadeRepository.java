package com.movie.repository;

import com.movie.model.Idade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IdadeRepository extends JpaRepository<Idade, Long> {

}
