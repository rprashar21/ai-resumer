package resumer.smart_resumer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/jd")
public class JobDescriptionController {

    public String getHello(){
        return "Hello World";
    }
}
