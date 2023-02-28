package tour.donnees.data.cards.repository

import tour.donnees.data.base.api.API
import tour.donnees.data.cards.remote.CardDTO

class CardRepositoryImpl constructor(
    private val api: API
): CardRepository {

    override suspend fun getAllCards(): Collection<CardDTO> {
        return api.getCards().cards
    }
}