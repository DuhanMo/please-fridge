**함수명 컨벤션**
- getXXXs: 복수 조회 
- getXXX: 단수 조회
- create: 생성
- delete: 삭제
- update: 업데이트

**API 반환 컨벤션**

- C,R,U,D 중 C,U,D는 기본적으로 반환값이 없음
- ResponseEntity 객체를 활용하여 응답
- C (Create) 201 Created
- R (Read) 200 OK + JSON
- U (Update) 204 No Content
- D (Delete) 204 No Content

**테스트 컨벤션**

1. domain layer 테스트는 String Spec으로 단위테스트
2. application layer 테스트는 Behavior Spec으로 단위테스트
    1. mocking이 필요한 경우 clearAllMock으로 테스트간 목킹 독립
3. infrastructure db-core layer 테스트
    1. Impl 테스트는 진행하지 않음(사유: 단순히 jpa or etc 클래스를 감싸기만하는 래핑 클래스)
    2. JpaRepository를 실제 컨텍스트를 활용하여 테스트 진행
        1. extensions(SpringExtension) ExpectSpec를 사용