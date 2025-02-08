package io.duhan.pleasefridge.domain

class Ingredient(
    val id: Long,
    var name: String,
    var quantity: IngredientQuantity,
    var unit: IngredientUnit,
) {
    fun update(
        name: String,
        quantity: IngredientQuantity,
        unit: IngredientUnit,
    ) {
        this.name = name
        this.quantity = quantity
        this.unit = unit
    }

    companion object {
        fun create(
            name: String,
            quantity: IngredientQuantity,
            unit: IngredientUnit,
        ): Ingredient {
            return Ingredient(0, name, quantity, unit)
        }
    }
}
