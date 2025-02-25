package com.graphql.GraphQL.Repo;

import com.graphql.GraphQL.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order, Integer> {
}
