
package com.example.docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class dockerswarn {
    @GetMapping ("/dockerswarn")
    public String getData() { return " Docker swarn test pages 12072023";}
}
