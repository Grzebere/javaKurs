package javaAdvanced.wzorceProjektowe.singelton.eager.zadanie1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public enum Servers {
    Instance;

    private Set<String> servers = new HashSet<>();

    public boolean dodaj(String nazwaSerwera) {
        if (sprawdzSerwer(nazwaSerwera)) {
            return servers.add(nazwaSerwera);
        }
        return Boolean.FALSE;
    }

    private boolean sprawdzSerwer(String nazwaSerwera) {
        String nazwaSerweraTemp = nazwaSerwera.toLowerCase();
        if(!nazwaSerwera.isEmpty()){
        return (nazwaSerwera.matches(("^http")) || nazwaSerwera.matches(("^https")));
    }
    return Boolean.FALSE;
    }

    private boolean isHttp(String nazwaSerwera){
        return nazwaSerwera.toLowerCase().matches(("^http"));
    }

    private boolean isHttps(String nazwaSerwera){
        return nazwaSerwera.toLowerCase().matches(("^https"));
    }

    public Set<String> getHttpList() {
        Set<String> serversHttp = new HashSet<>();
        for (String server : servers) {
            if (isHttp(server) && !isHttps(server))
                serversHttp.add(server);
        }
        return serversHttp;
        }
}

