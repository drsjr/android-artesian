package tour.donnees.arch.core.coroutine

import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext

class Scope(val context: CoroutineContext = SupervisorJob() + Dispatchers.Main) {

    /**
     * Custom [CoroutineScope] wrapper representing the application life state. This is required to make
     * sure that the scope is never cancelled.
     *
     * @property context the coroutine context, by default it's [SupervisorJob] and [Dispatchers.Main].
     */
    private val coroutineScope = object : CoroutineScope {
        override val coroutineContext: CoroutineContext
            get() = context
    }


    fun launch(
        context: CoroutineContext = EmptyCoroutineContext,
        start: CoroutineStart = CoroutineStart.DEFAULT,
        block: suspend CoroutineScope.() -> Unit
    ): Job = coroutineScope.launch(context = context, start = start, block = block)

}