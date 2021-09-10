package com.ait.test.ppob.gateway.jpa.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Product {

    @Id
    private String productCode;

    private String productName;

    private long sellPrice;

    private boolean isActive = true;
}
