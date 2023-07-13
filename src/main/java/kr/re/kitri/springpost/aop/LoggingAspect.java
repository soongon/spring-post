package kr.re.kitri.springpost.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class LoggingAspect {

    @Before("execution(* kr.re.kitri.springpost.service.PostService.*(..))")
    public void doLogging(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName(); // 호출되는 메소드 이름
        String className = joinPoint.getTarget().getClass().getName(); // 호출되는 메소드가 속한 클래스 이름
        log.debug(className + "." + methodName + " 함수에서 로그를 남깁니다.");
    }
}
