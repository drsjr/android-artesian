package tour.donnees.domain.pokedex.model

data class Pokemon(
    val id: String,
    val name: String,
    val nameId: String,
    val type: List<String>,
    val urlImage: String
)