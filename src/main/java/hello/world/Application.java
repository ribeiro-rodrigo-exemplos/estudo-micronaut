package hello.world;

import hello.world.model.Vehicle;
import hello.world.model.WeatherService;
import io.micronaut.context.ApplicationContext;
import io.micronaut.context.BeanContext;
import io.micronaut.runtime.Micronaut;
import io.micronaut.runtime.context.scope.refresh.RefreshEvent;

public class Application {

    public static void main(String[] args) throws Exception{
        Micronaut.run(Application.class);

        /*Vehicle vehicle = BeanContext.run().getBean(Vehicle.class);
        System.out.println(vehicle.start()); */

        try(ApplicationContext context = ApplicationContext.run()){
            Vehicle vehicle = context.getBean(Vehicle.class);
            System.out.println(vehicle.start());

            WeatherService weatherService = context.getBean(WeatherService.class);

            System.out.println(weatherService.latestForecast());

            Thread.sleep(2000);

            weatherService = context.getBean(WeatherService.class);

            System.out.println(weatherService.latestForecast());

            context.publishEvent(new RefreshEvent());

            Thread.sleep(2000);

            weatherService = context.getBean(WeatherService.class);

            System.out.println(weatherService.latestForecast());

        }
    }
}