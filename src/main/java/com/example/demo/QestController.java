package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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
}
