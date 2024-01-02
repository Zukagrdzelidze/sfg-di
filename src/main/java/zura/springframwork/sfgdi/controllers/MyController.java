package zura.springframwork.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import zura.springframwork.sfgdi.services.GreetingService;
import zura.springframwork.sfgdi.services.PrimaryBeanService;

@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(@Qualifier("primaryBeanService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
