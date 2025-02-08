package io.duhan.pleasefridge.domain

@JvmInline
value class IngredientQuantity(val value: Double) {
    init {
        require(value >= 0) { "재료의 수량은 0 이상이어야 합니다" }
    }
}
