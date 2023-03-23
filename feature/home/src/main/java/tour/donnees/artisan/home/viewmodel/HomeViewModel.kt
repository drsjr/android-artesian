package tour.donnees.artisan.home.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import tour.donnees.domain.cards.usecase.GetAllCardsUseCase
import tour.donnees.domain.pokedex.model.Pokemon
import tour.donnees.domain.pokedex.usecase.GetPokemonByIdUseCase

class HomeViewModel constructor(
    private val getAllCardsUseCase: GetAllCardsUseCase,
    private val getPokemonByIdUseCase: GetPokemonByIdUseCase
): ViewModel() {

    private val _pokemon = MutableLiveData<Pokemon>()
    val pokemon = _pokemon as LiveData<Pokemon>

    fun getPokemon() {
        viewModelScope.launch(Dispatchers.IO) {
            val poke = getPokemonByIdUseCase.invoke("001")
            _pokemon.postValue(poke)
        }
    }
}