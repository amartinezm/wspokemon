package com.amartinez.bankaya.wspokemon.service.impl;

import com.amartinez.bankaya.wspokemon.domain.dto.Auditoria;
import com.amartinez.bankaya.wspokemon.domain.entity.AuditoriaEntity;
import com.amartinez.bankaya.wspokemon.repository.AuditoriaRepository;
import com.amartinez.bankaya.wspokemon.service.IAuditoriaService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Abel Martínez Mendoza
 */
@Service
public class AuditoriaServiceImpl implements IAuditoriaService {

    @Autowired
    private AuditoriaRepository auditoriaRepository;

    /**
     *
     * @param auditoria
     */
    public void saveRequest(Auditoria auditoria) {
        AuditoriaEntity entity = AuditoriaEntity.builder().build();
        BeanUtils.copyProperties(auditoria, entity);
        auditoriaRepository.save(entity);
    }
}
