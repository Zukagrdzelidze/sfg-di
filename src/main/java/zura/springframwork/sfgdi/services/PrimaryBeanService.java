package zura.springframwork.sfgdi.services;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryBeanService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World - PRIMARY BEAN";
    }
}
