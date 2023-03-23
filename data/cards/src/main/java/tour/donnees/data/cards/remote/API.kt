package tour.donnees.data.cards.remote

import retrofit2.http.GET

interface API {

    @GET("v1/cards")
    suspend fun getCards(): AllCards
}