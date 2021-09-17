package com.graphql.example.resolver.query;

import com.graphql.example.domain.bank.BankAccount;
import com.graphql.example.domain.bank.Client;
import com.graphql.example.domain.bank.Currency;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

@Component
@Slf4j
public class BankAccountResolver implements GraphQLQueryResolver {

    public BankAccount bankAccount(UUID id){

        return BankAccount.builder().id(id)
                .currency(Currency.USD)
                .build();
    }

}
