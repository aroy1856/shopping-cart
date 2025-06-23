package com.roy.shoppingcart.repository;

import com.roy.shoppingcart.model.Image;
import com.roy.shoppingcart.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageRepository extends JpaRepository<Image, Long> {
}
