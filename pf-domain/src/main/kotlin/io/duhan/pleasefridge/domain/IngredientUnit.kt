package io.duhan.pleasefridge.domain

enum class IngredientUnit(val displayName: String) {
    PIECE("개"), // 개별로 셀 수 있는 것 (사과 1개, 계란 3개)
    PACK("팩"), // 포장 단위 (두부 1팩, 고기 1팩, 치즈 1팩)
    BOTTLE("병"), // 병에 담긴 액체류 (간장 1병, 우유 1병, 식초 1병)
    CAN("캔"), // 통조림류 (참치 1캔, 옥수수 1캔, 콩 1캔)
    BAG("봉지"), // 봉지 단위 (쌀 1봉지, 과자 1봉지, 라면 1봉지)
    GRAM("g"), // 무게 단위 (고기 500g, 밀가루 1000g, 소금 200g)
    LITER("L"), // 액체 단위 (우유 1L, 물 2L, 식용유 1L)
}
