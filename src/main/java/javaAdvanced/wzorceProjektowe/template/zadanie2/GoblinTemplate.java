package javaAdvanced.wzorceProjektowe.template.zadanie2;

import javaAdvanced.wzorceProjektowe.template.zadanie1.HeroTemplate;

public abstract class GoblinTemplate {
    public abstract int silaGoblina();
    public abstract int mocGoblina();
    public int silaAtakuGoblina(){
        return 5* silaGoblina() + 2 * mocGoblina();
    }

}