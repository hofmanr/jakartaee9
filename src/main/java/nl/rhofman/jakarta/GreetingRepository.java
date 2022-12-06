package nl.rhofman.jakarta;

import jakarta.enterprise.context.ApplicationScoped;

import java.util.HashMap;
import java.util.Map;

@ApplicationScoped
public class GreetingRepository {
    Map<String, String> entities;

    public GreetingRepository() {
        entities = new HashMap<>();
        entities.put("en", "Say Hello to ");
        entities.put("nl", "Zeg hallo tegen ");
        entities.put("es", "Saludar a ");
    }

    public String getGreeting(String language) {
        return entities.get(language);
    }
}
