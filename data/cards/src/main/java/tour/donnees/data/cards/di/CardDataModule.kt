package tour.donnees.data.cards.di

import org.koin.dsl.module
import tour.donnees.data.base.di.NetworkModule
import tour.donnees.data.cards.repository.CardRepository
import tour.donnees.data.cards.repository.CardRepositoryImpl

val CardDataModule = module {
    includes(NetworkModule)
    factory<CardRepository> { CardRepositoryImpl(get()) }
}