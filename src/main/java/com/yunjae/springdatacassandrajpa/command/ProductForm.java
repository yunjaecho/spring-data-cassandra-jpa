package com.yunjae.springdatacassandrajpa.command;

import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;

@Data
public class ProductForm {
    private UUID id;

    private String description;

    private BigDecimal price;

    private String imageUrl;

}
