package com.bootcamp.businessclientcredit.service;

import com.bootcamp.businessclientcredit.entity.CreditClient;
import com.bootcamp.businessclientcredit.repository.CreditClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CreditClientServiceImpl implements CreditClientService{


    @Autowired
    private CreditClientRepository creditClientRepository;

    @Override
    public Flux<CreditClient> findAll() {
        return creditClientRepository.findAll();
    }

    @Override
    public Mono<CreditClient> findById(String id) {
        return creditClientRepository.findById(id);
    }

    @Override
    public Mono<CreditClient> save(CreditClient creditClient) {
        return creditClientRepository.save(creditClient);
    }

    @Override
    public Mono<CreditClient> update(CreditClient creditClient) {
        return creditClientRepository.save(creditClient);
    }

    @Override
    public Mono<Void> deleteById(CreditClient creditClient) {
        return null;
    }
}
