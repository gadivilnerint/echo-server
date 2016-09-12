# echo-server
Goal - what is the feature
What is the business Goal?
At least 2 Relevant alternatives (pros and cons)
Chosen solution

The feature is a server which reply with the same string as it gets as an input.
The business goal is to test the server and to validate that it responding. That way we know for sure that the server is reachable.
One alternative may be using ServerSocket.


The chosen solution was to implement the server as a rest server, as such, the server gets its input in the url string, in the format of:

http://localhost:8080/echo_server?text=Gadi


Implementation of the controller:
@RestController
public class GreetingController {

   @RequestMapping("/echo_server")
   public String greeting(@RequestParam(value="text", defaultValue="Gadi") String text) {
       return text;//just returning the input string, as accepted from echo server
   }
}
