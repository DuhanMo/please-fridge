package io.duhan.pleasefridge.application.port

import io.duhan.pleasefridge.domain.Ingredient

interface IngredientRepository {
    fun save(ingredient: Ingredient): Ingredient

    fun getById(id: Long): Ingredient

    fun deleteById(id: Long)
}
