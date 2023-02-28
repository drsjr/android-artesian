package tour.donnees.domain.cards.usecase

import tour.donnees.domain.base.UseCase
import tour.donnees.domain.cards.model.Card

abstract class GetAllCardsUseCase: UseCase<Unit, Collection<Card>>{
    abstract override suspend fun execute(param: Unit): Collection<Card>
}