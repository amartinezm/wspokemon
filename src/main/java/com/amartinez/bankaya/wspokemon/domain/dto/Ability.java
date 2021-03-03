package com.amartinez.bankaya.wspokemon.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@RequiredArgsConstructor
@Data
@Builder
public class Ability {

    private AbilityDescription ability;
    private boolean is_hidden;
    private int slot;
}
