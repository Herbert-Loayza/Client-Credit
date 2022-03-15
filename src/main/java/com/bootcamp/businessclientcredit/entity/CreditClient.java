package com.bootcamp.businessclientcredit.entity;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(value = "credit_client")
public class CreditClient {

    @Id
    private String idCredit;
    private Integer accountNumber;
    private Integer LimitCredit;
    private Integer balance;
    private Integer payCredit;
    private String typeProductCredit;
}
