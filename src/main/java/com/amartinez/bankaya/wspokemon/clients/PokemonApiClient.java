package com.amartinez.bankaya.wspokemon.clients;

import com.amartinez.bankaya.wspokemon.domain.dto.LocationAreas;
import com.amartinez.bankaya.wspokemon.domain.dto.Locations;
import com.amartinez.bankaya.wspokemon.domain.dto.Pokemon;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Slf4j
@Component
public class PokemonApiClient {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${pokemon.api.url}")
    private String baseUrl;

    public Pokemon getPokemonByName(String name) {
        try {
            Pokemon pokemon = Optional.ofNullable(restTemplate.getForObject(baseUrl + "pokemon/" + "{name}", Pokemon.class, name))
                    .orElseThrow(() -> new NoSuchElementException(String.format("No existe un pokemon con el nombre %s", name)));
            return pokemon;
        } catch (Exception ex) {
            log.error("Error :: " + ex.getMessage());
            return null;
        }
    }

    public List<LocationAreas> getLocationAreaEncounters(String url, String name) {
        try {
            ResponseEntity<List<LocationAreas>> locations = restTemplate.exchange(url, HttpMethod.GET , null, new ParameterizedTypeReference<List<LocationAreas>>() {});
            return locations.getBody();
        } catch (Exception ex) {
            log.error("Error :: " + ex.getMessage());
            return null;
        }
    }
}
