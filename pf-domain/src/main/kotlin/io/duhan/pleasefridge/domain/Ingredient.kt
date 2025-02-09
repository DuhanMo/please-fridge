package io.duhan.pleasefridge.domain

class Ingredient(
    val id: Long,
    var name: String,
    var quantity: IngredientQuantity,
    var unit: IngredientUnit,
) {
    fun update(
        name: String,
        quantity: Double,
        unit: IngredientUnit,
    ) {
        this.name = name
        this.quantity = IngredientQuantity(quantity)
        this.unit = unit
    }

    companion object {
        fun create(
            name: String,
            quantity: Double,
            unit: IngredientUnit,
        ): Ingredient {
            return Ingredient(0L, name, IngredientQuantity(quantity), unit)
        }
    }
}
