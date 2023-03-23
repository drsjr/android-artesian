package tour.donnees.domain.pokedex.usecase

import tour.donnees.data.pokedex.repository.PokeDexRepository
import tour.donnees.domain.pokedex.map.PokemonMapping
import tour.donnees.domain.pokedex.model.Pokemon

class GetPokemonByIdUseCaseImpl(
    private val repository: PokeDexRepository
): GetPokemonByIdUseCase {
    override suspend fun invoke(nameId: String): Pokemon {
        return PokemonMapping().mapToModel(repository.getPokemonById(nameId))
    }
}