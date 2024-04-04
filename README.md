# 2024년도 1학기 스마트폰게임프로그래밍 프로젝트

## 게임 컨셉
### High Concept
플레이어는 자원을 사용하여 자신의 기지에서 캐릭터들을 소환하고, 반대편에서 몰려오는 적군들을 쓰러트리고 적 기지를 격파하여 승리한다.
### 핵심 메커니즘
- 플레이어 조작: 화면 터치로 진행되며 화면 하단에는 아군 UI와 강화 UI가 있다.
- 자원: 스테이지 동안 자원을 일정량 획득하게 되며 아군 소환, 획득량 강화에 소모된다.
- 경험치: 스테이지 클리어 시 일정량을 획득하며 아군 강화, 기지 강화에 소모된다.

## 개발 범위
### 스테이지
- 총 4 스테이지 (일반 스테이지: 3개, 보스 스테이지: 1개)
### 아군 및 적군
- 아군: 5가지
- 적군: 4가지 (일반 적군 3 가지, 보스 1 가지)
### 기술
- 아군 강화(체력 및 공격력 강화), 기지 강화

## 예상 게임 실행 흐름
1. 가지고 있는 자원으로 아군을 소환한다.
2. 몰려오는 적군과 싸움을 한다.
3. 적 기지에 도달하여 체력이 0으로 만들면 clear 한다.
4-1. 아군 기지가 적군에 의해 체력이 0이 되면 Game over가 된다.

## 개발 일정
- 1주차: 리소스 수집 및 UI 배치
- 2주차: 캐릭터 이동 및 애니메이션 구현
- 3주차: 자원 획득 및 자원 획득 강화 구현
- 4주차: 1 Stage 구현 및 클리어 OR Game over 구현
- 5주차: 2차 발표
- 6주차: 기술 강화 구현
- 7주차: 2 ~ 3 Stage 구현
- 8주차: 보스 Stage 구현
- 9주차: 디버깅 및 최종 발표