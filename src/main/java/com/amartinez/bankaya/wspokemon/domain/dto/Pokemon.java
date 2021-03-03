package com.amartinez.bankaya.wspokemon.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;
import java.util.List;

@RequiredArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Pokemon {

    private static final long serialVersionUID = 93188595119546053L;

    private List<Ability> abilities;
    private int base_experience;
    private List<HeldItem> held_items;
    private int id;
    private String location_area_encounters;
    private String name;
}
