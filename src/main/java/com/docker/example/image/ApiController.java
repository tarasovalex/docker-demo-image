package com.docker.example.image;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Alex Tarasov on 2/8/2018.
 */

@RestController
@RequestMapping("/api/v1")
public class ApiController {
    @RequestMapping("/text/{value}")
    public ResponseEntity<String> profile(@PathVariable("value") String value) {
        System.out.println(value + " >> " + Thread.currentThread().getName());

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping("/exit/{message}")
    public void exit(@PathVariable("message") String message) {
        System.out.println("Exit from Application with message: " + message);

        System.exit(0);
    }
}
