package com.movie.model;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.time.LocalDate;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Lancamento.class)
public class Lancamento_ {

    public static volatile SingularAttribute<Lancamento, Long> codigo;
    public static volatile SingularAttribute<Lancamento, LocalDate> dataLancamento;
    public static volatile SingularAttribute<Lancamento, Categoria> categoria;
    public static volatile SingularAttribute<Lancamento, Filme> filme;


}
