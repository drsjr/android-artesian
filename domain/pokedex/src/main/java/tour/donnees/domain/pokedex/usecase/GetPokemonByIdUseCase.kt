package tour.donnees.domain.pokedex.usecase

import tour.donnees.domain.pokedex.model.Pokemon

interface GetPokemonByIdUseCase {

    suspend fun invoke(nameId: String): Pokemon
}