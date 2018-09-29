package com.yunjae.springdatacassandrajpa.repositories;

import com.yunjae.springdatacassandrajpa.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

public interface ProductRepository extends CrudRepository<Product, UUID> {
}
