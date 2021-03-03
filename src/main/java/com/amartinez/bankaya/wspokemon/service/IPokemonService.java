package com.amartinez.bankaya.wspokemon.service;

import com.amartinez.bankaya.pokemon_web_service.*;

/**
 * @author Abel Martínez Mendoza
 */
public interface IPokemonService {
    AbilitiesResponse findAbilitiesPokemonByName(String name, String ip);

    BaseExperienceResponse findBaseExperiencePokemonByName(String name, String ip);

    HeldItemsResponse findHeldItemsPokemonByName(String name, String ip);

    IdResponse findIdPokemonByName(String name, String ip);

    NameResponse findNamePokemonByName(String name, String ip);

    LocationAreaResponse findLocationAreaEncountersByName(String name, String ip);
}
