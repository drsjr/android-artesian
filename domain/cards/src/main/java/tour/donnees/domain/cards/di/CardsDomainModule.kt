package tour.donnees.domain.cards.di

import org.koin.dsl.module
import tour.donnees.data.cards.di.CardDataModule
import tour.donnees.domain.cards.usecase.GetAllCardsUseCase
import tour.donnees.domain.cards.usecase.GetAllCardsUseCaseImpl

val CardsUseCaseModule = module {
    includes(CardDataModule)
    factory<GetAllCardsUseCase> { GetAllCardsUseCaseImpl(get()) }
}