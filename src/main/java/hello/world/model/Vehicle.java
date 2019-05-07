package hello.world.model;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

@Singleton
public class Vehicle {

    private final Engine engine;

    /*@Inject
    Vehicle(@Named("v8")Engine engine){
        this.engine = engine;
    }*/

    @Inject
    Vehicle(@V8 Engine engine){
        this.engine = engine;
    }

    Vehicle(String teste){
        engine = null;
    }

    public String start(){
        return engine.start();
    }
}
