package zura.springframwork.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import zura.springframwork.sfgdi.services.GreetingService;

@Controller
public class SetterInjectedController {
    private GreetingService greetingService;

    @Autowired
    @Qualifier("setterInjectedGreetingService")
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
