package aop;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by hyun ji Ra on 2017-08-30.
 */
//loggerAop 메소드가 결국 프록시(대행자)임...
public class LogAop {
    public Object loggerAop(ProceedingJoinPoint joinPoint) throws Throwable{
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

}
