package com.amartinez.bankaya.wspokemon.service.impl;

import com.amartinez.bankaya.pokemon_web_service.*;
import com.amartinez.bankaya.wspokemon.clients.PokemonApiClient;
import com.amartinez.bankaya.wspokemon.domain.dto.Auditoria;
import com.amartinez.bankaya.wspokemon.domain.dto.LocationAreas;
import com.amartinez.bankaya.wspokemon.domain.dto.Locations;
import com.amartinez.bankaya.wspokemon.domain.dto.Pokemon;
import com.amartinez.bankaya.wspokemon.service.IAuditoriaService;
import com.amartinez.bankaya.wspokemon.service.IPokemonService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Abel Martínez Mendoza
 */
@Service
@RequiredArgsConstructor
@Slf4j
public class PokemonServiceImpl implements IPokemonService {

    private static final String ABILITIES = "abilities";
    private static final String EXPERIENCE = "base_experience";
    private static final String ITEMS = "held_items";
    private static final String ID = "id";
    private static final String NAME = "name";
    private static final String LOCATION = "location_area_encounters";

    @Autowired
    private IAuditoriaService auditoriaService;

    private final PokemonApiClient pokemonApiClient;

    /**
     *
     * @param name
     * @param ip
     * @return
     */
    public AbilitiesResponse findAbilitiesPokemonByName(String name, String ip) {
        auditoriaService.saveRequest(Auditoria.builder()
                .dateRequest(LocalDateTime.now())
                .ipOrigin(ip)
                .methodExecution(ABILITIES).build());
        Pokemon pokemon = pokemonApiClient.getPokemonByName(name);

        AbilitiesResponse abilitiesResponse = new AbilitiesResponse();
        abilitiesResponse.getName().addAll(pokemon.getAbilities().stream()
                .map(ability -> ability.getAbility().getName()).collect(Collectors.toList()));
        return abilitiesResponse;
    }

    /**
     *
     * @param name
     * @param ip
     * @return
     */
    public BaseExperienceResponse findBaseExperiencePokemonByName(String name, String ip) {
        auditoriaService.saveRequest(Auditoria.builder()
                .dateRequest(LocalDateTime.now())
                .ipOrigin(ip)
                .methodExecution(EXPERIENCE).build());
        Pokemon pokemon = pokemonApiClient.getPokemonByName(name);

        BaseExperienceResponse baseExperienceResponse = new BaseExperienceResponse();
        baseExperienceResponse.setExperience(pokemon.getBase_experience());
        return baseExperienceResponse;
    }

    /**
     *
     * @param name
     * @param ip
     * @return
     */
    public HeldItemsResponse findHeldItemsPokemonByName(String name, String ip) {
        auditoriaService.saveRequest(Auditoria.builder()
                .dateRequest(LocalDateTime.now())
                .ipOrigin(ip)
                .methodExecution(ITEMS).build());
        Pokemon pokemon = pokemonApiClient.getPokemonByName(name);

        HeldItemsResponse heldItemsResponse = new HeldItemsResponse();
        heldItemsResponse.getNameItem().addAll(pokemon.getHeld_items().stream()
                .map(heldItem -> heldItem.getItem().getName()).collect(Collectors.toList()));
        return heldItemsResponse;
    }

    /**
     *
     * @param name
     * @param ip
     * @return
     */
    public IdResponse findIdPokemonByName(String name, String ip) {
        auditoriaService.saveRequest(Auditoria.builder()
                .dateRequest(LocalDateTime.now())
                .ipOrigin(ip)
                .methodExecution(ID).build());
        Pokemon pokemon = pokemonApiClient.getPokemonByName(name);

        IdResponse idResponse = new IdResponse();
        idResponse.setId(pokemon.getId());
        return idResponse;
    }

    /**
     *
     * @param name
     * @param ip
     * @return
     */
    public NameResponse findNamePokemonByName(String name, String ip) {
        auditoriaService.saveRequest(Auditoria.builder()
                .dateRequest(LocalDateTime.now())
                .ipOrigin(ip)
                .methodExecution(NAME).build());
        Pokemon pokemon = pokemonApiClient.getPokemonByName(name);
        NameResponse nameResponse = new NameResponse();
        nameResponse.setName(pokemon.getName());
        return nameResponse;
    }

    /**
     *
     * @param name
     * @param ip
     * @return
     */
    public LocationAreaResponse findLocationAreaEncountersByName(String name, String ip) {
        auditoriaService.saveRequest(Auditoria.builder()
                .dateRequest(LocalDateTime.now())
                .ipOrigin(ip)
                .methodExecution(LOCATION).build());
        Pokemon pokemon = pokemonApiClient.getPokemonByName(name);
        LocationAreaResponse locationAreaResponse = new LocationAreaResponse();
        if (pokemon.getLocation_area_encounters() != null && !pokemon.getLocation_area_encounters().isEmpty()) {
            List<LocationAreas> locations = pokemonApiClient.getLocationAreaEncounters(pokemon.getLocation_area_encounters(), name);
            locationAreaResponse.getLocationArea().addAll(locations.stream()
                    .map(locationAreas -> locationAreas.getLocation_area().getName()).collect(Collectors.toList()));
        }

        return locationAreaResponse;
    }

}
