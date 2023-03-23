package tour.donnees.data.cards.di

import org.koin.dsl.module
import retrofit2.Retrofit
import tour.donnees.data.base.di.NetworkModule
import tour.donnees.data.cards.remote.API
import tour.donnees.data.cards.repository.CardRepository
import tour.donnees.data.cards.repository.CardRepositoryImpl

val CardDataModule = module {
    includes(NetworkModule)

    single { get<Retrofit>().create(API::class.java) }

    factory<CardRepository> { CardRepositoryImpl(get()) }
}