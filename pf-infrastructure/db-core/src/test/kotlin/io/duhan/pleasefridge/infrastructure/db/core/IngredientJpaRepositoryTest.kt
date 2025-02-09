package io.duhan.pleasefridge.infrastructure.db.core

import io.duhan.pleasefridge.domain.IngredientUnit.PIECE
import io.duhan.pleasefridge.infrastructure.db.core.config.JpaConfig
import io.kotest.core.spec.style.ExpectSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.data.repository.findByIdOrNull
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.TestConstructor

@DataJpaTest
@ContextConfiguration(classes = [JpaConfig::class])
@TestConstructor(autowireMode = TestConstructor.AutowireMode.ALL)
class IngredientJpaRepositoryTest(
    private val sut: IngredientJpaRepository,
) : ExpectSpec({
        afterTest {
            sut.deleteAll()
        }

        context("재료 조회") {
            val entity = sut.save(IngredientEntity(0L, "계란", 3.0, PIECE))
            expect("식별자가 일치하는 재료 조회") {
                sut.findByIdOrNull(entity.id) shouldNotBe null
            }
        }

        context("재료 삭제") {
            val entity = sut.save(IngredientEntity(0L, "계란", 3.0, PIECE))
            expect("식별자가 일치하는 재료 삭제") {
                sut.deleteById(entity.id)
                sut.findByIdOrNull(entity.id) shouldBe null
            }
        }
    })
