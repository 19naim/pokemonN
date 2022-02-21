package com.example.pokemon.pokedex.controllers;

import com.example.pokemon.pokedex.entities.Pokemon;
import com.example.pokemon.pokedex.services.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class PokemonController {

    @Autowired
    PokemonService pokemonService;

    @GetMapping("/search/pokemons")
    public Pokemon getPokemons(String name) {
        return pokemonService.searchPokemon(name);
    }

    @GetMapping("/api/pokemons")
    public List<Pokemon> getMyPokemons(){
        return pokemonService.getAllMyPokemons();
    }

    @PostMapping("/api/pokemons")
    public Pokemon saveMyPokemon(@RequestBody Pokemon pokemon){
        return pokemonService.savePokemon(pokemon);
    }
}