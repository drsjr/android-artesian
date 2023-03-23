package tour.donnees.domain.pokedex.di

import org.koin.dsl.module
import tour.donnees.data.pokedex.di.PokeDexDataModule
import tour.donnees.domain.pokedex.usecase.GetPokemonByIdUseCase
import tour.donnees.domain.pokedex.usecase.GetPokemonByIdUseCaseImpl

val PokeDexDomainModule = module {
    includes(PokeDexDataModule)

    factory<GetPokemonByIdUseCase> { GetPokemonByIdUseCaseImpl(get()) }

}