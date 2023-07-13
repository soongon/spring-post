package kr.re.kitri.springpost;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy // AOP를 사용하기 위한 어노테이션
@SpringBootApplication
public class SpringPostApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringPostApplication.class, args);
	}
}
