package zura.springframwork.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import zura.springframwork.sfgdi.services.GreetingService;

@Controller
public class ConstructorInjectedController {
    private GreetingService greetingService;



    public ConstructorInjectedController(@Qualifier("constructorService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
