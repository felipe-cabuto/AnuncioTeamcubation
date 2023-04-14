package br.com.meli.anuncios.services;

import br.com.meli.anuncios.dto.AnuncioDto;

import java.util.List;

public interface AnuncioService {
    AnuncioDto create(AnuncioDto anuncioDto);

    AnuncioDto findById(Long id);

    List<AnuncioDto> findAll();

    AnuncioDto update(AnuncioDto anuncioDto);

    void delete(Long id);
}