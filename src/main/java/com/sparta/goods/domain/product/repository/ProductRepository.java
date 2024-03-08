package com.sparta.goods.domain.product.repository;

import com.sparta.goods.domain.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
