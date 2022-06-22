package com.example;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@Controller("/")
@Slf4j
public class TesyController {

    @GetMapping("/trail")
    @SneakyThrows
    public ResponseEntity<String> getMsg(){
        log.error("error msg");        
        log.info("info msg");
        log.warn("warn msg");
        log.debug("debug msg");
        log.fatal("fatal msg")
        return ResponseEntity.ok("From service1");
    }
}
