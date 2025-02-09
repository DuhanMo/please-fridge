package io.duhan.pleasefridge.application.service

import io.duhan.pleasefridge.application.port.IngredientRepository
import io.duhan.pleasefridge.domain.Ingredient
import io.duhan.pleasefridge.domain.IngredientQuantity
import io.duhan.pleasefridge.domain.IngredientUnit.PIECE
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.BehaviorSpec
import io.mockk.clearAllMocks
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify

class IngredientCommandServiceTest : BehaviorSpec({
    val ingredientRepository = mockk<IngredientRepository>()
    val sut = IngredientCommandService(ingredientRepository)

    afterTest {
        clearAllMocks()
    }

    Given("유효한 재료 정보가 주어졌을 때") {
        every { ingredientRepository.save(any()) } returnsArgument 0

        When("재료를 생성하면") {
            sut.create("계란", 3.0, PIECE)

            Then("재료가 저장된다") {
                verify(exactly = 1) { ingredientRepository.save(any()) }
            }
        }
    }

    Given("기존 재료가 존재하는 경우") {
        every { ingredientRepository.save(any()) } returnsArgument 0
        every { ingredientRepository.getById(any()) } returns Ingredient(1L, "계란", IngredientQuantity(2.0), PIECE)

        When("재료를 수정하면") {
            sut.update(1L, "계란", 3.0, PIECE)

            Then("재료가 저장된다") {
                verify(exactly = 1) { ingredientRepository.save(any()) }
            }
        }
    }

    Given("기존 재료가 존재하지 않는 경우") {
        every { ingredientRepository.getById(any()) } throws NoSuchElementException()

        When("재료를 수정하면") {
            Then("예외 발생한다") {
                shouldThrow<NoSuchElementException> { sut.update(1L, "계란", 3.0, PIECE) }
            }
        }
    }
})
