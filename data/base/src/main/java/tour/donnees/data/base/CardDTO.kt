package tour.donnees.data.cards.remote

import com.google.gson.annotations.SerializedName

data class AllCards(
    @SerializedName("cards") val cards: Collection<CardDTO>
)

data class CardDTO(
    val name: String?,
    val artist: String?,
    val cmc: Double?,
    val colorIdentity: List<String>?,
    val colors: List<String>?,
    val foreignNames: List<ForeignName>?,
    val id: String?,
    val multiverseid: String?,
    val imageUrl: String?,
    val layout: String?,
    val legalities: List<Legality>?,
    val manaCost: String?,
    val number: String?,
    val originalText: String?,
    val originalType: String?,
    val power: String?,
    val printings: List<String>?,
    val rarity: String?,
    val `set`: String?,
    val setName: String?,
    val subtypes: List<String>?,
    val text: String?,
    val toughness: String?,
    val type: String?,
    val types: List<String>?,
    val variations: List<String>
)

data class ForeignName(
    val flavor: String?,
    val imageUrl: String?,
    val language: String?,
    val multiverseid: Int?,
    val name: String?,
    val text: String?,
    val type: String
)

data class Legality(
    val format: String?,
    val legality: String?
)