package tour.donnees.data.pokedex.repository

import tour.donnees.data.pokedex.datasource.remote.dto.PokemonDTO

interface PokeDexRepository {
    suspend fun getPokemonById(nameId: String): PokemonDTO
}