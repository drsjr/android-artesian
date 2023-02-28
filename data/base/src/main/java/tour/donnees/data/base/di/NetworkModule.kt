package tour.donnees.data.base.di

import com.google.gson.GsonBuilder
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val NetworkModule = module {
    single { getOkHttpClient() }
    single { getRetrofit(get()) }
}

private fun getOkHttpClient(): OkHttpClient {
    return OkHttpClient.Builder()
        .addInterceptor(
            if (true) HttpLoggingInterceptor().apply {
                level = HttpLoggingInterceptor.Level.BODY
            } else Interceptor {chain ->
                chain.proceed(chain.request())
            }
        )
        .build()
}

private fun getRetrofit(okHttpClient: OkHttpClient): Retrofit {
    return Retrofit.Builder()
        .client(okHttpClient)
        .baseUrl(
            "https://api.magicthegathering.io/"
        )
        //.addConverterFactory(MoshiConverterFactory.create())
        .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
        .build()
}