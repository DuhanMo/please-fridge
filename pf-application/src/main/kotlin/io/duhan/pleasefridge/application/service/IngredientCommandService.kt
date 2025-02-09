package io.duhan.pleasefridge.application.service

import io.duhan.pleasefridge.application.port.IngredientRepository
import io.duhan.pleasefridge.domain.Ingredient
import io.duhan.pleasefridge.domain.IngredientUnit
import org.springframework.stereotype.Service

@Service
class IngredientCommandService(
    private val ingredientRepository: IngredientRepository,
) {
    fun create(
        name: String,
        quantity: Double,
        unit: IngredientUnit,
    ) {
        val ingredient = Ingredient.create(name, quantity, unit)
        ingredientRepository.save(ingredient)
    }

    fun update(
        id: Long,
        name: String,
        quantity: Double,
        unit: IngredientUnit,
    ) {
        val ingredient = ingredientRepository.getById(id)
        ingredient.update(name, quantity, unit)
        ingredientRepository.save(ingredient)
    }

    fun delete(id: Long) {
        ingredientRepository.deleteById(id)
    }
}
