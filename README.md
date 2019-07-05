# Spring_ex8_board
 
# 1. Project setting

## 1) Encoding 설정
####	web.xml EncodingFilter 등록

## 2) API 설정(pom.xml)
####	a. springframework 4. 이상
####	b. MyBatis
####	 - myBatis
####	 - spring-myBatis
####	 - spring-jdbc
####	 - ojdbc6
####	c. fileUpload
####	 - commons-fileUpload(commons-io)
####	d. JunitTest
####	 - junit ver 4.12 이상
####	 - spring-test
## 3) JUNIT TEST 설정
####	 a. src/test/java
####	 	- 기본패키지 내에 AbstrctTest junit test case 작성
####	 	- 클래스 선언부에 @RunWith(SpringJUnit4ClassRunner.class) / @ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/**/*-context.xml"}) 
####		- 다른 junit test case 생성해서 상속 받아서 사용

## 4) XML 파일 설정
####	a. Server-context.xml

####	b. root-context.xml
####		- myBatis
####		 1) Connection - properties 파일 사용 	: DriverManagerDataSource
####		 2) connection, xml 				: SqlSessionFactoryBean
####		 3) 최종 Mapping 						: SqlSessionTemplate
####		- fileUpload
####		 1) CommonsMultipartResolver
####		- properties 파일 위치 설정
####		 1) PropertyPlaceholderConfigurer

## 5) Mybatis 설정
####		- file들의 위치
####			src/main/resources 하위에 myBatis 폴더 생성
####			config	 : mybatis 설정 파일들
####			mappers  : mybatis sql 파일들






















