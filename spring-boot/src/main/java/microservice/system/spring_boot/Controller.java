package microservice.system.spring_boot;

import org.springframework.web.bind.annotation.*;

import static microservice.system.spring_boot.Book.findBookById;

@RestController
@RequestMapping("/")
public class Controller {
    @GetMapping("/{id}") //, produces = "application/json"
    public @ResponseBody Book getBook(@PathVariable int id) {
        return findBookById(id);
    }
    String home(String phrase) {
        return "Hello Andrew Friend! We are "+phrase;
    }
}
