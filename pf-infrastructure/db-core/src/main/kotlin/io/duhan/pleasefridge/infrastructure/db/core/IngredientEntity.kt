package io.duhan.pleasefridge.infrastructure.db.core

import io.duhan.pleasefridge.domain.Ingredient
import io.duhan.pleasefridge.domain.IngredientQuantity
import io.duhan.pleasefridge.domain.IngredientUnit
import jakarta.persistence.Entity
import jakarta.persistence.EnumType.STRING
import jakarta.persistence.Enumerated
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType.IDENTITY
import jakarta.persistence.Id
import jakarta.persistence.Table

@Table(name = "ingredient")
@Entity
class IngredientEntity(
    @Id
    @GeneratedValue(strategy = IDENTITY)
    val id: Long,
    var name: String,
    var quantity: Double,
    @Enumerated(STRING)
    var unit: IngredientUnit,
) {
    constructor(model: Ingredient) : this(
        id = model.id,
        name = model.name,
        quantity = model.quantity.value,
        unit = model.unit,
    )

    fun toModel(): Ingredient {
        return Ingredient(id, name, IngredientQuantity(quantity), unit)
    }
}
