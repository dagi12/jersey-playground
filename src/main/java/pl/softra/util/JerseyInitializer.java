package pl.softra.util;

import jakarta.inject.Inject;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;
import pl.softra.asd.MyService;

@WebListener
public class JerseyInitializer implements ServletContextListener {

    @Inject
    MyService myService;

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        myService.someMethod();
    }

}
