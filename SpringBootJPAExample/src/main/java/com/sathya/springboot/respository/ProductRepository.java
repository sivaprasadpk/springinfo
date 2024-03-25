package com.sathya.springboot.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.sathya.springboot.Product;
@Repository
@Component
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
