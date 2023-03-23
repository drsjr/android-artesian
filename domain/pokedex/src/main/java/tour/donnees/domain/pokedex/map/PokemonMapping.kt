package tour.donnees.domain.pokedex.map

import tour.donnees.data.pokedex.datasource.remote.dto.PokemonDTO
import tour.donnees.domain.pokedex.model.Pokemon

class PokemonMapping {

    fun mapToModel(dto: PokemonDTO): Pokemon {
        return Pokemon(
            id = dto.id,
            name = dto.name,
            nameId = dto.nameId,
            type = dto.type,
            urlImage = dto.urlImage
        )
    }
}