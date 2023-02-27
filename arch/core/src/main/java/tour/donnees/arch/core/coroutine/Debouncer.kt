package tour.donnees.arch.core.coroutine

import kotlinx.coroutines.CoroutineScope

interface Debouncer {
    operator fun invoke(
        delay: Long,
        coroutineScope: CoroutineScope,
        block: suspend () -> Unit
    )
}
