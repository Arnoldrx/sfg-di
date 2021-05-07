package guru.sprimgframework.sfgdi.services;

import org.springframework.stereotype.Component;

@Component
public class Singletonbean {
    public Singletonbean() {
        System.out.println("Creating a Singleton Bean!!");
    }

    public String getMyScope() {
        return "I'm a singleton";
    }
}
