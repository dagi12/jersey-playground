package pl.softra.asd;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MyService {

    public void someMethod() {
        System.out.println("MyService's someMethod called");
    }
}