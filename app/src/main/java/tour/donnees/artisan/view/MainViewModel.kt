package tour.donnees.artisan.view

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import tour.donnees.domain.cards.model.Card
import tour.donnees.domain.cards.usecase.GetAllCardsUseCase

class MainViewModel constructor(
    private val getAllCardsUseCase: GetAllCardsUseCase
): ViewModel() {

    val list = mutableStateOf<List<Card>>(emptyList())

    fun getAllCards() {
        viewModelScope.launch {
            val test = getAllCardsUseCase.execute(Unit)
            list.value = test.toList()
        }
    }

}