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
   

     
# API 설계 가이드
| HTTP Method | URL Pattern | 동작 | 설명 |
| --- | --- | --- | --- |
| GET | /stores/{id} | Read | 매장 조회 |
| POST | /stores | Create | 매장 등록 |
| PATCH | /stores/{id} | Update | 매장 운영 유/무 변경 |
| DELETE | /stores/{id} | Delete | 매장 삭제 |
| GET | /employees/{id} | Read | 직원 조회 |
| POST |  /employees | Create | 직원 등록 |
| PATCH | /employees/{id} | Update | 직원 직책 변경 |
| DELETE | /employees/{id} | Delete | 직원 삭제 |
| GET | /menus/{id} | Read | 메뉴 조회 |
| POST | /menus | Create | 메뉴 등록 |
| DELETE | /menus/{id} | Delete | 메뉴 삭제 |
| PATCH | /menus/{id} | Update | 메뉴 판매 유/무 변경 |
    
#### 상태 코드
| 코드 | 설명 |
| --- | --- |
| 200 | 요청 성공 |
| 201 | 리소스 생성 성공 |
| 400 | 잘못된 요청 |
| 401 | 인증 필요 |
| 403 | 권한 없음 |
| 404 | 리소스 없음 |
| 500 | 서버 오류 |


      
