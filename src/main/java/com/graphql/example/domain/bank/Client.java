package com.graphql.example.domain.bank;

import lombok.Builder;
import lombok.Setter;

import java.util.List;

@Setter
@Builder
public class Client {
    String firstName;
    String lastName;
    List<String> middleName;
    Client client;
}
