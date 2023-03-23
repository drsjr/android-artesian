package tour.donnees.arch.core.coroutine

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

internal class DebouncerImpl: Debouncer {
    private var debouncerJob: Job? = null
    override fun invoke(delay: Long, coroutineScope: CoroutineScope, block: suspend () -> Unit) {
        debouncerJob?.cancel()

        debouncerJob = coroutineScope.launch {
            delay(delay)
            block()
        }
    }
}