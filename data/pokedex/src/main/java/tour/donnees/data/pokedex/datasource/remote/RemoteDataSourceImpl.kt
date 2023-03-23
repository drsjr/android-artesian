package tour.donnees.data.pokedex.datasource.remote

import tour.donnees.data.pokedex.datasource.RemoteDataSource
import tour.donnees.data.pokedex.datasource.remote.dto.PokemonDTO

class RemoteDataSourceImpl(
    private val api: PokeDexAPI
): RemoteDataSource {

    override suspend fun getPokemonById(nameId: String): PokemonDTO {
        return api.getPokemonById(id = nameId)
    }


}