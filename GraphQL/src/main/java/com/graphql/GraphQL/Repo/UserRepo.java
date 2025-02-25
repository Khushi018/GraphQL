package com.graphql.GraphQL.Repo;

import com.graphql.GraphQL.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
//    custom query methods
//    custom finder methods

}
