package com.yunjae.springdatacassandrajpa.services;

import com.yunjae.springdatacassandrajpa.command.ProductForm;
import com.yunjae.springdatacassandrajpa.entity.Product;

import java.util.List;
import java.util.UUID;

public interface ProductService {

    List<Product> listAll();

    Product getById(UUID id);

    Product saveOrUpdate(Product product);

    void delete(UUID id);

    Product saveOrUpdateProductForm(ProductForm prodctForm);
}
