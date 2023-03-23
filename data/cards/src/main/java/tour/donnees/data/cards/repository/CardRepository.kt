package tour.donnees.data.cards.repository

import tour.donnees.data.cards.remote.CardDTO

interface CardRepository {

    suspend fun getAllCards(): Collection<CardDTO>
}