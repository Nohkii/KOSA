package aop00;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet { // 대리자 역할의 클래스 = MyInternet 대신 사용할 수 있도록
    private Internet internet; // 인터넷을 상속해야함
    private static List<String> blackListedHost;
    static {
        blackListedHost = new ArrayList<>();
        blackListedHost.add("www.hacker.com");
        blackListedHost.add("www.facebook.com");
        blackListedHost.add("www.instagram.com");
    }
    @Override
    public Status openConnection(String host) {
        if (blackListedHost.contains(host)) {
            return Status.BLACKLISTED;
        }
        if (internet == null) {
            this.internet = new MyInternet();
        }
        return internet.openConnection(host); // 대리자 역할,,
    }
}
