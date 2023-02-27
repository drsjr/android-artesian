package tour.donnees.artisan.di

import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module
import tour.donnees.arch.core.coroutine.Scope

val appModule = module {

    single { Scope() }
}