package hello.world.model;

import io.micronaut.context.annotation.*;
import io.micronaut.runtime.context.scope.Refreshable;
import io.micronaut.runtime.context.scope.ThreadLocal;

import javax.inject.Singleton;

@Primary
//@Context
//@Prototype
//@Infrastructure
//@ThreadLocal
//@Refreshable
//@Parallel
@Singleton
public class Green implements ColorPicker {

    @Override
    public String color(){
        return "green";
    }
}
