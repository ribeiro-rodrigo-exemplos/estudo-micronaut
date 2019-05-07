package hello.world.model;

import io.micronaut.runtime.context.scope.Refreshable;

import javax.annotation.PostConstruct;
import java.text.SimpleDateFormat;
import java.util.Date;

@Refreshable
public class WeatherService {

    private String forecast;

    @PostConstruct
    public void init(){
        forecast = "Scattered Clouds" + new SimpleDateFormat("dd/MMM/yy HH:mm:ss.SSS").format(new Date());
    }

    public String latestForecast(){
        return forecast;
    }
}
