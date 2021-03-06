package javaAdvanced.wzorceProjektowe.proxy.przyklad;

public class User {
    private String loginName;
    private TypUser typUser;
    public User(String loginName, TypUser typUser) {
        this.loginName = loginName;
        this.typUser = typUser;
    }
    public String getLoginName() {
        return loginName;
    }
    public TypUser getTypUser() {
        return typUser;
    }
}