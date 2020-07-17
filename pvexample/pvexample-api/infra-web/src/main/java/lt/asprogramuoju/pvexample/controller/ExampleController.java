package lt.asprogramuoju.pvexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Example controller
 *
 * @author pavel.vrublevskij
 * @version 1.0.0
 */
@RestController
public class ExampleController {

    /**
     * Show example message
     */
    @GetMapping("/example")
    public String getExample() {
        return "This is output of example controller";
    }
}
