package com.amartinez.bankaya.wspokemon.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Auditoria implements Serializable {

    private static final long serialVersionUID = -3790355961402694093L;

    private Long id;
    private String ipOrigin;
    private LocalDateTime dateRequest;
    private String methodExecution;
}
