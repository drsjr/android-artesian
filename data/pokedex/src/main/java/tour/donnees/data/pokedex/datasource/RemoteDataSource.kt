package tour.donnees.data.pokedex.datasource

import tour.donnees.data.pokedex.datasource.remote.dto.PokemonDTO

interface RemoteDataSource {
    suspend fun getPokemonById(nameId: String): PokemonDTO
}