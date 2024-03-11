package com.sparta.goods.domain.cart.repository;

import com.sparta.goods.domain.cart.entity.Cart;
import com.sparta.goods.domain.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CartRepository extends JpaRepository<Cart, Long> {

    Optional<Cart> findByItemsProduct(Product product);
}
