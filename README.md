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

### 플레이어
플레이어는 스테이지 클리어 시 경험치를 획득할 수 있으며, 이를 통해 캐릭터들의 레벨 강화, 기지 강화에 소요된다.
- 캐릭터 레벨 강화: 최대 10레벨 까지 성장할 수 있으며, 레벨 당 수치가 1레벨의 10%가 증가한다.
- 기지 체력 강화: 1레벨 체력(1000) ~ 10레벨 체력(5500), 레벨 당 500씩 증가한다.
- 자원 획득량 강화: 1레벨 초당 획득량(5) ~ 10레벨 초당 획득량(50), 레벨 당 5씩 증가한다.
- 최대 자원량 강화: 1레벨 최대 자원량(300) ~ 10레벨 최대 자원량(3000), 레벨 당 300씩 증가한다.

### 캐릭터
캐릭터들은 공통적으로 공격력, 체력, 공격 범위, 공격 속도를 가지고 있으며, 아군 캐릭터들은 추가로 가격, 레벨을 가진다.
- 공격력: 상대방에게 공격을 통해 줄 수 있는 데미지이다.
- 체력: 정해진 수치를 가지고 있으며 체력이 0이하로 내려가면 사망하게 된다.
- 공격 범위: 상대방에게 공격할 때의 범위를 나타낸다.
- 공격 속도: 공격할 때 걸리는 속도이며, 1 ~ 5 사이를 가지고 있으며 숫자가 높을수록 빠르게 공격한다.
- 가격: 아군 캐릭터에게만 존재하는 것으로, 소환할 때 필요한 자원량이다.
- 레벨: 아군 캐릭터에게만 존재하는 것으로, 기본적으로 1레벨을 시작으로 경험치를 통해 최대 10레벨까지 성장할 수 있다.
#### 아군(5가지)
1. 고양이 ![아군1](https://github.com/Leeju2826/SPGP2024_TermProject_2017180031/blob/main/1stChart/character_Team_1_Profile.png)
- 공격력(최대): 20(40), 체력: 250(500), 가격: 50, 공격 범위: 단일, 공격 속도: 4, 레벨 강화 경험치 비용: 100
2. 탱크 고양이 ![아군2](https://github.com/Leeju2826/SPGP2024_TermProject_2017180031/blob/main/1stChart/character_Team_2_Profile.png)
- 공격력(최대): 10(20), 체력: 1000(2000), 가격: 150, 공격 범위: 단일, 공격 속도: 2, 레벨 강화 경험치 비용: 300
3. 배틀 고양이 ![아군3](https://github.com/Leeju2826/SPGP2024_TermProject_2017180031/blob/main/1stChart/character_Team_3_Profile.png)
- 공격력(최대): 60(120), 체력: 500(1000), 가격: 300, 공격 범위: 단일, 공격 속도: 3, 레벨 강화 경험치 비용: 500
4. 고양이 새 ![아군4](https://github.com/Leeju2826/SPGP2024_TermProject_2017180031/blob/main/1stChart/character_Team_4_Profile.png)
- 공격력(최대): 70(140), 체력: 1500(3000), 가격: 500, 공격 범위: 단일, 공격 속도: 3, 레벨 강화 경험치 비용: 600
5. 거신 고양이 ![아군5](https://github.com/Leeju2826/SPGP2024_TermProject_2017180031/blob/main/1stChart/character_Team_5_Profile.png)
- 공격력(최대): 700(1400), 체력: 2500(5000), 가격: 2000, 공격 범위: 단일, 공격 속도: 2, 레벨 강화 경험치 비용: 1000
#### 적군(4가지)
적군 캐릭터들은 스테이지동안 랜덤 시간대에 등장한다.
1. 멍뭉이 ![적군1](https://github.com/Leeju2826/SPGP2024_TermProject_2017180031/blob/main/1stChart/character_Enemy_1_Profile.png)
- 공격력: 8, 체력: 90, 공격 범위: 단일, 공격 속도: 4
2. 낼름이 ![적군2](https://github.com/Leeju2826/SPGP2024_TermProject_2017180031/blob/main/1stChart/character_Enemy_2_Profile.png)
- 공격력: 15, 체력: 100, 공격 범위: 단일, 공격 속도: 3
3. 곰선생 ![적군3](https://github.com/Leeju2826/SPGP2024_TermProject_2017180031/blob/main/1stChart/character_Enemy_3_Profile.png)
- 공격력: 400, 체력: 3000, 공격 범위: 단일, 공격 속도: 2
4. 사이클론(보스) ![적군4](https://github.com/Leeju2826/SPGP2024_TermProject_2017180031/blob/main/1stChart/character_Enemy_4_Profile.png)
- 공격력: 2000, 체력: 30000, 공격 범위: 단일, 공격 속도: 1

## 예상 게임 실행 흐름
1. 자원으로 아군을 소환한다.
![흐름도1](https://github.com/Leeju2826/SPGP2024_TermProject_2017180031/blob/main/1stChart/gameFlowChart_1.png)
2. 몰려오는 적과 싸움을 한다.
![흐름도2](https://github.com/Leeju2826/SPGP2024_TermProject_2017180031/blob/main/1stChart/gameFlowChart_2.png)
3. 적 기지에 도달하여 체력이 0으로 만들면 clear 한다.
![흐름도3](https://github.com/Leeju2826/SPGP2024_TermProject_2017180031/blob/main/1stChart/gameFlowChart_3.png)


## 개발 일정
- 1주차: 리소스 수집 및 스테이지 UI 배치
- 2주차: 캐릭터 이동, 공격, 사망 애니메이션 구현
- 3주차: 자원 획득 및 자원 획득량 강화 구현
- 4주차: 1 Stage 구현 및 클리어 OR Game over 구현
- 5주차: 2차 발표
- 6주차: 기지, 아군 강화 구현
- 7주차: 2 ~ 3 Stage 구현
- 8주차: 보스 Stage 구현
- 9주차: 디버깅 및 최종 발표

## 1차 발표
<https://www.youtube.com/watch?v=pusTQJGbj6g>
