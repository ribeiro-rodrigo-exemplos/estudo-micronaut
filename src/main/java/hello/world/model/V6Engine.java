package hello.world.model;

import javax.inject.Singleton;

@Singleton
public class V6Engine implements Engine {

    public String start(){
        return "Starting v6";
    }

    public int getCylinders(){
        return 6;
    }

}
