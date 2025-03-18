package br.edu.ifpr.foz.spring_project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/greetings")
public class GreetingsController {

    private final OtherComponent otherComponent;

    GreetingsController(OtherComponent otherComponent) {
        this.otherComponent = otherComponent;
    }

    @GetMapping("")
    @ResponseBody
    public String greetings() {
        return "Greetins! Welcome to the Spring Project!";
    }

    @GetMapping("/headers")
    @ResponseBody
    public String getRequestHeaders(HttpServletRequest request) {
        String userAgent = request.getHeader("User-Agent");

        return "<h1>" + userAgent + "</h1>";
    }

    @GetMapping("/user-agent")
    @ResponseBody
    public void userAgent(@RequestHeader("User-Agent") String userAgent) {

        System.out.println("User-Agent: " + userAgent);

    }

}
