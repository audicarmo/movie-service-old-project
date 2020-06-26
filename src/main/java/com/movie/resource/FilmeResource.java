package com.movie.resource;

import com.movie.event.RecursoCriadoEvent;
import com.movie.exceptionHandler.MovieExceptionHandler;
import com.movie.model.Filme;
import com.movie.repository.FilmeRepository;
import com.movie.service.FilmeService;
import com.movie.service.exception.FilmeInexistenteOuInativoException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/filmes")
public class FilmeResource {

    @Autowired
    private FilmeRepository filmeRepository;

    @Autowired
    private FilmeService filmeService;

    @Autowired
    private ApplicationEventPublisher publisher;


    @Autowired
    private MessageSource messageSource;

    @GetMapping
    public List<Filme> listar() {
        return filmeRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Filme> criar(@RequestBody Filme filme, HttpServletResponse response) {
        Filme filmeSalvo = filmeRepository.save(filme);
        publisher.publishEvent(new RecursoCriadoEvent(this, response, filmeSalvo.getCodigo()));
        return ResponseEntity.status(HttpStatus.CREATED).body(filmeSalvo);
    }

    @GetMapping("/{codigo}")
    public ResponseEntity<Filme> buscarPeloCodigo(@PathVariable Long codigo) {
        Filme filme = filmeRepository.getOne(codigo);
        return filme != null ? ResponseEntity.ok(filme) : ResponseEntity.notFound().build();
    }

    @PutMapping("/{codigo}")
    public ResponseEntity<Filme> atualizar(@PathVariable Long codigo, @RequestBody Filme filme) {
        Filme filmeSalvo = filmeService.atualizar(codigo, filme);
        return ResponseEntity.ok(filmeSalvo);
    }

    @ExceptionHandler({ FilmeInexistenteOuInativoException.class })
    public ResponseEntity<Object> handleFilmeInexistenteOuInativoException(FilmeInexistenteOuInativoException ex) {
        String mensagemUsuario = messageSource.getMessage("pessoa.inexistente-ou-inativa", null, LocaleContextHolder.getLocale());
        String mensagemDesenvolvedor = ex.toString();
        List<MovieExceptionHandler.Erro> erros = Arrays.asList(new MovieExceptionHandler.Erro(mensagemUsuario, mensagemDesenvolvedor));
        return ResponseEntity.badRequest().body(erros);
    }

    @PutMapping("/{codigo}/ativo")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void atualizarPropriedadeAtivo(@PathVariable Long codigo, @RequestBody Boolean ativo) {
        filmeService.atualizarPropriedadeAtivo(codigo, ativo);
    }
}
