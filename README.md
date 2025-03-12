# mission subject
☕ 프랜차이즈 커피 매장 관리 시스템



# E-R Diagram
![18530e0e-d2ca-405b-a090-7ae50ea01aa4](https://github.com/user-attachments/assets/ed80126f-256c-47be-a8de-7289af2768d9)




# 테이블 설계
1. store 커피 매장

`store_id` (PK) : ID

`store_regist_num` : 매장 등록 번호

`store_name` : 매장 명

`area` : 매장 지역 (서울, 경기, 부산 등) 

`address` : 주소

`tel` : 전화번호

`operation_yn` : 운영 유무

`open_time` : 오픈 시간

`close_time` : 마감 시간


2. employee 커피 매장 직원

`employee_id` (PK) : ID

`id` : 직원 사번

`name` : 이름

`role` : 직책/역할 (점주, 점장, 매니저 등)

`store_id` (FK) : 커피 매장 ID 



3. menu 메뉴

`menu_id` (PK) : ID 

`menu_name` : 메뉴명

`category` : 대분류 코드(종류) (1: 커피, 2: 케익, 3: MD 등) 

`price` : 가격

`open_date` : 출시일


4. store_menu 상점 메뉴 관리

`store_menu_id` (PK) : ID

`store_id` (FK) : 커피 매장 ID

`menu_id` (FK) : 메뉴 ID

`availability_yn` : 판매 가능 여부

`note` : 메뉴 설명



# API 명세
작성 예정

