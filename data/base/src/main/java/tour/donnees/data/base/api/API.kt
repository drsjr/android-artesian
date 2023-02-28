package tour.donnees.data.base.api

import retrofit2.http.GET
import tour.donnees.data.cards.remote.AllCards

interface API {

    @GET("v1/cards")
    suspend fun getCards(): AllCards
}