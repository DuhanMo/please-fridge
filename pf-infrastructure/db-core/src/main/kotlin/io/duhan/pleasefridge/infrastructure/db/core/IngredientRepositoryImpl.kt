package io.duhan.pleasefridge.infrastructure.db.core

import io.duhan.pleasefridge.application.port.IngredientRepository
import io.duhan.pleasefridge.domain.Ingredient
import org.springframework.data.repository.findByIdOrNull

class IngredientRepositoryImpl(
    private val ingredientJpaRepository: IngredientJpaRepository,
) : IngredientRepository {
    override fun save(ingredient: Ingredient): Ingredient {
        return ingredientJpaRepository.save(IngredientEntity(ingredient)).toModel()
    }

    override fun getById(id: Long): Ingredient {
        return ingredientJpaRepository.findByIdOrNull(id)?.toModel()
            ?: throw NoSuchElementException("재료가 존재하지 않습니다. id: $id")
    }

    override fun deleteById(id: Long) {
        ingredientJpaRepository.deleteById(id)
    }
}
