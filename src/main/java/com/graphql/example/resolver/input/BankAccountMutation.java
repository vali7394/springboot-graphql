package com.graphql.example.resolver.input;

import com.graphql.example.domain.bank.BankAccount;
import com.graphql.example.domain.bank.Client;
import com.graphql.example.domain.bank.CreateBankAccount;
import com.graphql.example.domain.bank.Currency;
import graphql.kickstart.tools.GraphQLMutationResolver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@Slf4j
public class BankAccountMutation implements GraphQLMutationResolver {

    public BankAccount createBankMutation(CreateBankAccount bankAccount){
        return BankAccount.builder()
                .client(Client.builder()
                .firstName(bankAccount.getFirstName()).build())
                .id(UUID.randomUUID())
                .currency(Currency.USD).build();
    }
}
