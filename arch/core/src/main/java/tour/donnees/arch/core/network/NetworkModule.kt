package tour.donnees.arch.core.network

import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor

object NetworkModule {

    private const val INTERCEPTOR_LOGGING_NAME = "INTERCEPTOR_LOGGING"



    private fun provideLoggingInterceptor(): Interceptor {
        return if (true) HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BODY
        } else Interceptor {chain ->
            chain.proceed(chain.request())
        }
    }

    private fun provideClient(
        interceptor: Interceptor
    ): OkHttpClient {
        return OkHttpClient
            .Builder()
            .apply {
                addInterceptor(interceptor)
            }.build()
    }
}