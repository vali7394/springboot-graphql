package com.graphql.example.exception;

import graphql.GraphQLException;
import graphql.kickstart.spring.error.ThrowableGraphQLError;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Component
public class GraphQlExceptionHandler {
    @ExceptionHandler(GraphQLException.class)
    public ThrowableGraphQLError graphQlException(GraphQLException graphqlErrorException){
        return new ThrowableGraphQLError(graphqlErrorException);
    }
}
