package com.amartinez.bankaya.wspokemon.controller;

import com.amartinez.bankaya.pokemon_web_service.*;
import com.amartinez.bankaya.wspokemon.service.IPokemonService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import javax.servlet.http.HttpServletRequest;


/**
 * @author Abel Martínez Mendoza
 */
@RequiredArgsConstructor
@Endpoint
public class PokemonEndpoint {
    private static final String NAMESPACE_URI = "http://amartinez.com/bankaya/pokemon-web-service";

    @Autowired
    private IPokemonService pokemonService;

    private final HttpServletRequest httpServletRequest;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "abilities")
    @ResponsePayload
    public AbilitiesResponse findAbilitiesPokemonByName(@RequestPayload Abilities request) {
        return pokemonService.findAbilitiesPokemonByName(request.getNamePokemon(), httpServletRequest.getRemoteHost());
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "base_experience")
    @ResponsePayload
    public BaseExperienceResponse findBaseExperiencePokemonByName(@RequestPayload BaseExperience request) {
        return pokemonService.findBaseExperiencePokemonByName(request.getNamePokemon(), httpServletRequest.getRemoteHost());
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "held_items")
    @ResponsePayload
    public HeldItemsResponse findHeldItemsPokemonByName(@RequestPayload HeldItems request) {
        return pokemonService.findHeldItemsPokemonByName(request.getNamePokemon(), httpServletRequest.getRemoteHost());
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "id")
    @ResponsePayload
    public IdResponse findIdPokemonByName(@RequestPayload Id request) {
        return pokemonService.findIdPokemonByName(request.getNamePokemon(), httpServletRequest.getRemoteHost());
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "name")
    @ResponsePayload
    public NameResponse findNamePokemonByName(@RequestPayload Name request) {
        return pokemonService.findNamePokemonByName(request.getNamePokemon(), httpServletRequest.getRemoteHost());
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "location_area_encounters")
    @ResponsePayload
    public LocationAreaResponse findLocationAreaEncountersByName(@RequestPayload LocationAreaEncounters request) {
        return pokemonService.findLocationAreaEncountersByName(request.getNamePokemon(), httpServletRequest.getRemoteHost());
    }
}