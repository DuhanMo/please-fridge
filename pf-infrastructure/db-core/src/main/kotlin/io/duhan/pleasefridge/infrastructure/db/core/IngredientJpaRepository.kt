package io.duhan.pleasefridge.infrastructure.db.core

import org.springframework.data.jpa.repository.JpaRepository

interface IngredientJpaRepository : JpaRepository<IngredientEntity, Long>
