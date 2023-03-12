package org.muguang.helloboot.controller;

import java.util.Locale;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class EchoController {

    @GetMapping("/echo")
    public String echo(@RequestParam("p") String param) {
        return param.toUpperCase(Locale.ROOT);
    }
}
