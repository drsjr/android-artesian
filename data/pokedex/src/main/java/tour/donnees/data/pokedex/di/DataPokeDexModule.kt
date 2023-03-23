package tour.donnees.data.pokedex.di

import org.koin.dsl.module
import retrofit2.Retrofit
import tour.donnees.data.base.di.NetworkModule
import tour.donnees.data.pokedex.datasource.RemoteDataSource
import tour.donnees.data.pokedex.datasource.remote.PokeDexAPI
import tour.donnees.data.pokedex.datasource.remote.RemoteDataSourceImpl
import tour.donnees.data.pokedex.repository.PokeDexRepository
import tour.donnees.data.pokedex.repository.PokeDexRepositoryImpl

val DataPokeDexModule = module {
    includes(NetworkModule)

    single { get<Retrofit>().create(PokeDexAPI::class.java) }

    factory<RemoteDataSource> { RemoteDataSourceImpl(get()) }

    factory<PokeDexRepository> { PokeDexRepositoryImpl(get()) }

}