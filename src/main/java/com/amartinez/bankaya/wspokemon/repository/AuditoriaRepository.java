package com.amartinez.bankaya.wspokemon.repository;

import com.amartinez.bankaya.wspokemon.domain.entity.AuditoriaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Abel Martínez Mendoza
 */
@Repository
public interface AuditoriaRepository extends JpaRepository<AuditoriaEntity, Long> {
}
