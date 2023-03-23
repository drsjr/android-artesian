package tour.donnees.artisan.home.di

import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module
import tour.donnees.domain.cards.di.CardsUseCaseModule
import tour.donnees.artisan.home.viewmodel.HomeViewModel

val HomeModule = module {
    includes(CardsUseCaseModule)
    viewModelOf(::HomeViewModel)
}