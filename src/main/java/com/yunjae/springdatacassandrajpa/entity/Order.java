package com.yunjae.springdatacassandrajpa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.core.mapping.Table;

import java.time.LocalDate;
import java.time.ZoneId;

@Table("order")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    @Id
    String id;

    LocalDate orderDate;

    ZoneId zoneId;
}
