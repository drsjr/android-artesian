package tour.donnees.arch.core.coroutine.di

import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.bind
import org.koin.dsl.module
import tour.donnees.arch.core.coroutine.Debouncer
import tour.donnees.arch.core.coroutine.DebouncerImpl

val coroutineModule = module {
    factoryOf(::DebouncerImpl) bind Debouncer::class
}