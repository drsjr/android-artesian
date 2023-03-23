package tour.donnees.artisan.application

import android.app.Application
import coil.ImageLoader
import coil.ImageLoaderFactory
import coil.util.DebugLogger
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level
import org.koin.core.module.Module
import tour.donnees.artisan.di.appModule
import tour.donnees.artisan.home.di.HomeModule
import tour.donnees.domain.cards.di.CardsUseCaseModule

class ArtisanApplication: Application(), ImageLoaderFactory {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger(Level.NONE)
            androidContext(this@ArtisanApplication)
            modules(getAllModules())
        }

    }

    private fun getAllModules(): List<Module> = listOf(
        CardsUseCaseModule,
        HomeModule,
        appModule
    )

    override fun newImageLoader(): ImageLoader {
        return ImageLoader.Builder(this)
            .crossfade(true)
            .logger(DebugLogger())
            .build()
    }

}