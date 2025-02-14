package zura.springframwork.sfgdi.services;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"EN", "default"})
@Service("i18nService")
public class I18nServiceEnglish implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello World - ENGLISH";
    }
}
