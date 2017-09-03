package aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by hyun ji Ra on 2017-09-03.
 */
@Aspect
public class LogAopAnotation {

    @Pointcut("within(aop.*)")
    private  void pointcutMethod(){
    }

    @Around("pointcutMethod()")
    public Object loggerAop(ProceedingJoinPoint joinPoint) throws  Throwable{
        String signatureStr = joinPoint.getSignature().toShortString();
        System.out.println(signatureStr+ " is start");
        long st= System.currentTimeMillis(); // 요게 공통기능이죠
        try {
            Object object = joinPoint.proceed(); //핵심기능 실행
            return  object;
        }finally {
            long et= System.currentTimeMillis();
            System.out.println(signatureStr+ " is finished");
            System.out.println(signatureStr+ "  경과시간: " + (et-st));

        }
    }
    @Before("within(aop.*)") // 핵심기능이 실행되기전에 한번 실행됨(pointcut 메소드를 만들필요가 없다)
    public void beforeAdvice(){
        System.out.println("beforeAdvice()");
    }

}
