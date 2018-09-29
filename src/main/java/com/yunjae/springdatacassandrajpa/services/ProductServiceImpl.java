package com.yunjae.springdatacassandrajpa.services;

import com.yunjae.springdatacassandrajpa.command.ProductForm;
import com.yunjae.springdatacassandrajpa.converts.ProductFormToProduct;
import com.yunjae.springdatacassandrajpa.entity.Product;
import com.yunjae.springdatacassandrajpa.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    private ProductFormToProduct productFormToProduct;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository, ProductFormToProduct productFormToProduct) {
        this.productRepository = productRepository;
        this.productFormToProduct = productFormToProduct;
    }


    @Override
    public List<Product> listAll() {
        List<Product> products = new ArrayList<>();
        productRepository.findAll().forEach(products::add);
        return products;
    }

    @Override
    public Product getById(UUID id) {
        return productRepository.findById(id).orElseGet(null);
    }

    @Override
    public Product saveOrUpdate(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void delete(UUID id) {
        productRepository.deleteById(id);
    }

    @Override
    public Product saveOrUpdateProductForm(ProductForm prodctForm) {
        Product savedProduct = saveOrUpdate(productFormToProduct.convert(prodctForm));

        System.out.println("Saved Product Id : " + savedProduct.getId());
        return savedProduct;
    }
}
