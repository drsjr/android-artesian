package tour.donnees.artisan.application

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level
import org.koin.core.module.Module
import tour.donnees.arch.core.coroutine.di.coroutineModule
import tour.donnees.artisan.di.appModule

class ArtisanApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger(Level.NONE)
            androidContext(this@ArtisanApplication)
            modules(getAllModules())
        }

    }

    internal fun getAllModules(): List<Module> = listOf(
        appModule,
        coroutineModule
    )
}