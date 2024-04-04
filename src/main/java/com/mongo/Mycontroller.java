package com.mongo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mycontroller {



    @GetMapping("/load")
    public ResponseEntity<?> loadMassage( ){
    return  new ResponseEntity<String>("Hi ", HttpStatus.ACCEPTED);
    }


    @GetMapping("/loadAll")
    public ResponseEntity<?> loadAllMassage( ){
        return  new ResponseEntity<String>("Load All Api called ", HttpStatus.ACCEPTED);
    }
}



