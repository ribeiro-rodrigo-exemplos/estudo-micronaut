package hello.world.model;

import javax.inject.Named;
import javax.inject.Qualifier;
import javax.inject.Singleton;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Qualifier
//@Retention(RetentionPolicy.RUNTIME)
@interface V8{}

@Singleton
//@Named("v8Teste")
public class V8Engine implements Engine {

    private int cylinders = 8;

    @Override
    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    @Override
    public String start() {
        return "Starting V8";
    }

}
