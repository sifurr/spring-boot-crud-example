package com.saifur.springboot.crud.example.repository;

import com.saifur.springboot.crud.example.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer>
{

}
