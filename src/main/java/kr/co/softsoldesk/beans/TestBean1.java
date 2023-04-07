package kr.co.softsoldesk.beans;

import org.springframework.stereotype.Component;

@Component
public class TestBean1 {
	
	
	
}
/* 
Inversion of Control : 제어의 전환
IoC 컨테이너 객체를 생성할 때 자동으로 객체가 생성
- 기본형 : Autowire-ByType, singleton으로 주입
- config에 @Bean으로 등록한 것과 동일
*/