package com.bootcamp.businessclientcredit.repository;

import com.bootcamp.businessclientcredit.entity.CreditClient;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface CreditClientRepository extends ReactiveMongoRepository<CreditClient, String> {

}
