package tour.donnees.artisan.view

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import tour.donnees.domain.cards.usecase.GetAllCardsUseCase

class MainViewModel constructor(
    private val getAllCardsUseCase: GetAllCardsUseCase
): ViewModel() {

    fun getAllCards() {
        viewModelScope.launch {
           getAllCardsUseCase.execute(Unit).map {
               println("Card: name (${it.name}, url (${it.url}))")
           }
        }
    }

}