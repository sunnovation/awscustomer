package com.customer;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CutomerController {

    @GetMapping("/health-check")
    public ResponseEntity<String> health(){
        return new ResponseEntity<>("Customer service is UP !", HttpStatus.OK);
    }
}
