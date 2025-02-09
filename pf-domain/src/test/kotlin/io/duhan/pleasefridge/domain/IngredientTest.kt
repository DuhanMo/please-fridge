package io.duhan.pleasefridge.domain

import io.duhan.pleasefridge.domain.IngredientUnit.GRAM
import io.duhan.pleasefridge.domain.IngredientUnit.PIECE
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class IngredientTest : StringSpec({
    "재료의 수량은 0 미만일 경우 예외 발생한다" {
        shouldThrow<IllegalArgumentException> {
            Ingredient.create("계란", -1.0, PIECE)
        }
    }

    "재료의 정보를 수정할 수 있다" {
        val sut = Ingredient.create("계란", 2.0, PIECE)

        sut.update("소금", 500.0, GRAM)

        sut.name shouldBe "소금"
        sut.quantity shouldBe IngredientQuantity(500.0)
        sut.unit shouldBe GRAM
    }
})
