package com.graphql.example.resolver;

import com.graphql.example.domain.bank.BankAccount;
import com.graphql.example.domain.bank.Client;
import graphql.GraphQLException;
import graphql.execution.DataFetcherResult;
import graphql.kickstart.execution.error.GenericGraphQLError;
import graphql.kickstart.tools.GraphQLResolver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
@Slf4j
public class ClientResolver implements GraphQLResolver<BankAccount> {

    public DataFetcherResult<Client> client(BankAccount bankAccount){
        log.info("Called Client Resolver");
        Client client = Client.builder().firstName("Bhavni")
                .lastName("Malarapu")
                .middleName(Collections.emptyList())
                .build();
        return  DataFetcherResult
                .<Client>newResult()
                .data(Client.builder()
                .firstName("vali")
                .lastName("malarapu")
                .middleName(List.of("Meera"))
                .client(client)
                .build())
               // .error(new GenericGraphQLError("Subclient Id not fetched"))
                .build();
    }

}
