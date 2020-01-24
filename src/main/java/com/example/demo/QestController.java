package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@CrossOrigin
@RestController
public class QestController {

    QestRepository repository;

    public QestController(QestRepository repository) {
        this.repository = repository;
    }




    @GetMapping("/{search}")
    public List<Qest> getAll(@PathVariable String search){
        return repository.findByQuestionContaining(search);
    }

    @PostMapping("/upload/{id}")
    public boolean upload(@RequestBody String answ,@PathVariable Long id){
        Qest a = null;
               if( repository.findById(id).isPresent()){
                   a=repository.findById(id).get();
                   a.setAnswer(answ);
                   repository.save(a);
               }
        return true;
    }
}
