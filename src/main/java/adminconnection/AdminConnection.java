package adminconnection;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

/**
 * Created by hyun ji Ra on 2017-08-30.
 */
public class AdminConnection implements EnvironmentAware,InitializingBean,DisposableBean {
    private Environment environment;
    private String adminId;
    private String adminPw;
    private String subId;
    private String subPw;

    public void destroy() throws Exception {
        System.out.println("destroy()");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet()");
        setAdminId(environment.getProperty("admin.id"));
        setAdminPw(environment.getProperty("admin.pw"));

    }

    public void setEnvironment(Environment environment) {
        System.out.println("setEnvironment()");
        setEnv(environment);
    }
    public void setEnv(Environment environment){
        this.environment = environment;
    }

    public void setAdminId(String adminId){
        this.adminId=adminId;
    }
    public void setAdminPw(String adminPw){
        this.adminPw=adminPw;
    }

    public String getAdminId() {
        return adminId;
    }

    public String getAdminPw() {
        return adminPw;
    }

    public String getSubId() {
        return subId;
    }

    public void setSubId(String subId) {
        this.subId = subId;
    }

    public String getSubPw() {
        return subPw;
    }

    public void setSubPw(String subPw) {
        this.subPw = subPw;
    }
}
