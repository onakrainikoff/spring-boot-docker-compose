package ru.on8off.compose.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.on8off.compose.service.CounterService;


@RestController("/")
@Slf4j
public class CounterController {
    @Autowired
    private CounterService productService;

    @GetMapping("/")
    public Long incrementAndGet(){
        return productService.incrementAndGet();
    }

}
