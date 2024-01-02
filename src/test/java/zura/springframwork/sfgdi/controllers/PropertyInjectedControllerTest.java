package zura.springframwork.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import zura.springframwork.sfgdi.services.ConstructorService;

class PropertyInjectedControllerTest {
    PropertyInjectedController controller;
    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();
        controller.greetingService = new ConstructorService();
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}