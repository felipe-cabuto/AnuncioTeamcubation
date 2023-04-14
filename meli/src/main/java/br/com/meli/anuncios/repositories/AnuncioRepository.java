package br.com.meli.anuncios.repositories;

import br.com.meli.anuncios.entitites.Anuncio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AnuncioRepository extends JpaRepository<Anuncio, Long> {
    Optional<Anuncio> findByName(String name);
}