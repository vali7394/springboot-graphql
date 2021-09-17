package com.graphql.example.domain.bank;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.Value;

import java.util.UUID;

@Setter
@Getter
@Builder
public class BankAccount {

    UUID id;
    Client client;
    Currency currency;

}
