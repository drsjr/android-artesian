package tour.donnees.artisan.home.viewmodel

import androidx.lifecycle.ViewModel
import tour.donnees.domain.cards.usecase.GetAllCardsUseCase

class HomeViewModel constructor(
    private val getAllCardsUseCase: GetAllCardsUseCase
): ViewModel() {


    fun getAllCards() {

    }
}