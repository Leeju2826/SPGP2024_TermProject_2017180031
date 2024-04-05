# 2024년도 1학기 스마트폰게임프로그래밍 프로젝트
## 게임 제목 : 냥코 대전쟁
![이미지](https://github.com/Leeju2826/SPGP2024_TermProject_2017180031/blob/main/1stChart/gameImage.png)

## 게임 컨셉
### High Concept
플레이어는 자원을 사용하여 자신의 기지에서 캐릭터들을 소환하고, 반대편에서 몰려오는 적군들을 쓰러트리고 적 기지를 격파하여 승리한다.
### 핵심 메커니즘
- 플레이어 조작: 화면 터치로 진행되며 화면 하단에는 아군 UI와 강화 UI가 있다.
- 자원: 스테이지 동안 자원을 일정량 획득하게 되며 아군 소환, 자원 획득량 강화에 소모되며 스테이지 클리어 시 자원은 초기화된다.
- 경험치: 스테이지 클리어 시 일정량을 획득하며 아군 강화, 기지 강화에 소모되며 이는 영구적으로 지속된다.


## 개발 범위
### 스테이지
- 총 4 스테이지 (일반 스테이지: 3개, 보스 스테이지: 1개)
### 캐릭터
- 아군: 5가지
- 1. 고양이 ![아군1](https://github.com/Leeju2826/SPGP2024_TermProject_2017180031/blob/main/1stChart/character_Team_1_Profile)
- 공격력(최대): 20(55), 체력:250(500), 가격: 50
- 적군: 4가지 (일반 적군 3 가지, 보스 1 가지)
![적군](https://github.com/Leeju2826/SPGP2024_TermProject_2017180031/blob/main/FlowChart/char2.png)
### 강화
- 아군 강화(체력 및 공격력 강화), 기지 강화(기지 최대 체력, 자원 획득량, 최대 자원 강화)


## 예상 게임 실행 흐름
1. 자원으로 아군을 소환한다.
![흐름도1](https://github.com/Leeju2826/SPGP2024_TermProject_2017180031/blob/main/FlowChart/1.png)
2. 몰려오는 적과 싸움을 한다.
![흐름도2](https://github.com/Leeju2826/SPGP2024_TermProject_2017180031/blob/main/FlowChart/2.png)
3. 적 기지에 도달하여 체력이 0으로 만들면 clear 한다.
![흐름도3](https://github.com/Leeju2826/SPGP2024_TermProject_2017180031/blob/main/FlowChart/3.png)


## 개발 일정
- 1주차: 리소스 수집 및 UI 배치
- 2주차: 캐릭터 이동 및 애니메이션 구현
- 3주차: 자원 획득 및 자원 획득량 강화 구현
- 4주차: 1 Stage 구현 및 클리어 OR Game over 구현
- 5주차: 2차 발표
- 6주차: 기지, 아군 강화 구현
- 7주차: 2 ~ 3 Stage 구현
- 8주차: 보스 Stage 구현
- 9주차: 디버깅 및 최종 발표

## 1차 발표
<https://www.youtube.com/watch?v=pusTQJGbj6g>
