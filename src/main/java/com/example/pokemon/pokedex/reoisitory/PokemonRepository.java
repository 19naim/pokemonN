package com.example.pokemon.pokedex.reoisitory;



import com.example.pokemon.pokedex.entities.Pokemon;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PokemonRepository extends MongoRepository<Pokemon, String> {
}
