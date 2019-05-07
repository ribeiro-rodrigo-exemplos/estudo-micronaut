package hello.world;

import hello.world.model.Vehicle;
import io.micronaut.context.ApplicationContext;
import io.micronaut.context.BeanContext;
import io.micronaut.runtime.Micronaut;

public class Application {

    public static void main(String[] args) {
        Micronaut.run(Application.class);

        /*Vehicle vehicle = BeanContext.run().getBean(Vehicle.class);
        System.out.println(vehicle.start()); */

        try(ApplicationContext context = ApplicationContext.run()){
            Vehicle vehicle = context.getBean(Vehicle.class);
            System.out.println(vehicle.start());
        }
    }
}