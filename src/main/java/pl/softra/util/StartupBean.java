package pl.softra.util;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;
import jakarta.enterprise.context.Initialized;
import jakarta.inject.Inject;
import pl.softra.asd.MyService;

@ApplicationScoped
public class StartupBean {

    @Inject
    private MyService myService;

    public void init(@Observes @Initialized(ApplicationScoped.class) Object init) {
        myService.someMethod();
    }

    @PostConstruct
    public void onStartup() {
        System.out.println("StartupBean initialized");
    }

}