package tour.donnees.domain.base

interface UseCase<I, T> {
    suspend fun execute(param: I): T
}