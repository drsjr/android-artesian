package tour.donnees.artisan.di

import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module
import tour.donnees.artisan.view.MainViewModel

val appModule = module {
    viewModelOf(::MainViewModel)
}