package hello.world;

import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.runtime.server.EmbeddedServer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.micronaut.test.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

@MicronautTest
public class HelloControllerSpec{

    @Inject
    public EmbeddedServer server;

    @Inject
    @Client("/")
    public HttpClient client2;

    @Inject
    private HelloClient client;

    @Test
    public void testHelloWorldResponse(){
        //String response = client.toBlocking().retrieve(HttpRequest.GET("/hello")); 
        String response = client.hello().blockingGet(); 
        assertEquals("Hello World", response);
    }
}