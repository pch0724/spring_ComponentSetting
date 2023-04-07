package kr.co.softsoldesk.beans;

import org.springframework.stereotype.Component;

@Component("t3")
public class TestBean2 {
	
}
/* 
Inversion of Control : 제어의 전환
IoC 컨테이너 객체를 생성할 때 자동으로 객체가 생성
- 기본형 : Autowire-ByType, singleton으로 주입
- config에 @Bean으로 등록한 것과 동일

- 하나만 생성하여 사용할 경우 Autowire-ByType이 효율적
- 이름으로 주입할 경우 식별자 역할을 하지만 BeanConfigClass에 여러 개를 주입하여 사용하는 것이 바람직함
  => 이름 식별자를 통한 주입은 사용빈도가 적음 
*/