package fi.hh.swd20.hello.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HelloController {

    @RequestMapping("*")
    public String world() {
        return "Hello World and Universe !!";
    }

    @RequestMapping("/hello")
    public String hello(@RequestParam( name = "firstname" ) String fname,
                        @RequestParam( name = "lastname" ) String lname) {
        return "Hei " + fname + " " + lname + "!";
    }
    
}
