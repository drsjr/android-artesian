package tour.donnees.domain.cards.usecase

import tour.donnees.data.cards.repository.CardRepository
import tour.donnees.domain.cards.model.Card

class GetAllCardsUseCaseImpl(
    private val cardRepository: CardRepository
): GetAllCardsUseCase() {
    override suspend fun execute(param: Unit): Collection<Card> {
        return cardRepository.getAllCards()
            .filter { it.imageUrl != null }
            .map {
                Card(it.name.orEmpty(), it.imageUrl.orEmpty())
            }
    }
}