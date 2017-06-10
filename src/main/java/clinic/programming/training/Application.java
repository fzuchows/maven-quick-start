package clinic.programming.training;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by FrankZ on 10.06.2017.
 */
public class Application {

    public Application() {
        System.out.println("Inside application");
    }


    public void greet() {
        List<String> greetings = new ArrayList<>();
        greetings.add("Hello");
        for(String greeting : greetings) {
            System.out.println("Greeting: " + greeting);
        }
    }

    public static void main(String[] args) {
        System.out.println("Starting Application");
        Application app = new Application();
        app.greet();
    }

}
