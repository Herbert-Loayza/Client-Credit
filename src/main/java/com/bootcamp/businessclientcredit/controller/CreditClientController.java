package com.bootcamp.businessclientcredit.controller;


import com.bootcamp.businessclientcredit.entity.CreditClient;
import com.bootcamp.businessclientcredit.service.CreditClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/credit")
public class CreditClientController {

    @Autowired
    private CreditClientService creditClientService;

    @GetMapping
    public Flux<CreditClient> getAll(){
        return creditClientService.findAll();
    }
    @GetMapping("/{id}")
    public Mono<CreditClient> findById(@PathVariable String id){
        return creditClientService.findById(id);
    }

    @PostMapping("/update")
    public Mono<CreditClient> create(@RequestBody CreditClient creditClient){
        return creditClientService.save(creditClient);
    }

    @PutMapping("/{id}")
    public Mono<CreditClient> update(@RequestBody CreditClient creditClient){
        return creditClientService.update(creditClient);
    }

    @DeleteMapping("/{id}")
    public Mono<Void>deleteById(@PathVariable("id") String id){
        return null;
    }
}
