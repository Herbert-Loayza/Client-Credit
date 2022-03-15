package com.bootcamp.businessclientcredit.service;


import com.bootcamp.businessclientcredit.entity.CreditClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CreditClientService {

    public Flux<CreditClient> findAll();
    public Mono<CreditClient> findById(String id);
    public Mono<CreditClient>save(CreditClient creditClient);
    public Mono<CreditClient> update(CreditClient creditClient);
    public Mono<Void>deleteById(CreditClient creditClient);
}
