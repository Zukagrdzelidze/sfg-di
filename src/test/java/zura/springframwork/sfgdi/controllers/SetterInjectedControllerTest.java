package zura.springframwork.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import zura.springframwork.sfgdi.services.ConstructorService;

class SetterInjectedControllerTest {

    SetterInjectedController controller;
    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingService(new ConstructorService());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}