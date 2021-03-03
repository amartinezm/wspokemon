package com.amartinez.bankaya.wspokemon.service;


import com.amartinez.bankaya.wspokemon.domain.dto.Auditoria;

/**
 * @author Abel Martínez Mendoza
 */
public interface IAuditoriaService {
    void saveRequest(Auditoria auditoria);
}
