package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @RequestMapping("/echo_server")
    public String greeting(@RequestParam(value="text", defaultValue="Gadi") String text) {
        return text;//just returning the input string, as accepted from echo server
    }
}
