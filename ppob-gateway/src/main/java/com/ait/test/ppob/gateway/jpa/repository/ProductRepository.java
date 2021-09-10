package com.ait.test.ppob.gateway.jpa.repository;

import com.ait.test.ppob.gateway.jpa.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,String> {
}
