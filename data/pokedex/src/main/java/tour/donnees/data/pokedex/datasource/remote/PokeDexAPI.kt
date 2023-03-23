package tour.donnees.data.pokedex.datasource.remote

import retrofit2.http.GET
import retrofit2.http.Path
import tour.donnees.data.pokedex.datasource.remote.dto.PokemonDTO

interface PokeDexAPI {
    @GET("/pokemon/{id}")
    suspend fun getPokemonById(@Path("id") id: String): PokemonDTO
}