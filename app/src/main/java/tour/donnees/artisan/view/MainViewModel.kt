package tour.donnees.artisan.view

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import tour.donnees.data.cards.repository.CardRepository

class MainViewModel constructor(
    private val cardRepository: CardRepository
): ViewModel() {

    fun test() {

        viewModelScope.launch {
            val test = cardRepository.getAllCards()
            test.toList()
        }
    }

}