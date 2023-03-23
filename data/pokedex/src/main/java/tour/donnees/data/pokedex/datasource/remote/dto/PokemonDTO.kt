package tour.donnees.data.pokedex.datasource.remote.dto

import com.google.gson.annotations.SerializedName

data class PokemonDTO(
    @SerializedName("id") val id: String,
    @SerializedName("name") val name: String,
    @SerializedName("nameId") val nameId: String,
    @SerializedName("type") val type: List<String>
)