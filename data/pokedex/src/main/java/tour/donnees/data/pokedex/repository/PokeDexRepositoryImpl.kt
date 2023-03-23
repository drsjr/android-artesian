package tour.donnees.data.pokedex.repository

import tour.donnees.data.pokedex.datasource.RemoteDataSource
import tour.donnees.data.pokedex.datasource.remote.dto.PokemonDTO

class PokeDexRepositoryImpl(
    private val remoteDataSource: RemoteDataSource
): PokeDexRepository {
    override suspend fun getPokemonById(nameId: String): PokemonDTO {
        return remoteDataSource.getPokemonById(nameId = nameId)
    }
}