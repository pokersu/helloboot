package org.muguang.helloboot.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/time")
public class TimeController {


    @GetMapping
    public String currentTime() {
        LocalDateTime curTime = LocalDateTime.now();
        var list = List.of("test", "nvim", "from remote machine");
        for (String str : list) {
            System.out.println(str);
        }
        var superlong = list.stream().filter(s->s.length()>10).collect(Collectors.toList());
        superlong.stream().forEach(System.out::println);
        return curTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }
    
}
