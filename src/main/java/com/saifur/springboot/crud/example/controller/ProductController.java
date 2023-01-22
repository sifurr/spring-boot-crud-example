package com.saifur.springboot.crud.example.controller;

import com.saifur.springboot.crud.example.entity.Product;
import com.saifur.springboot.crud.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController
{
    @Autowired
    private ProductService service;

    // Post method
    @PostMapping("/add-product")
    public Product addProduct(@RequestBody Product product)
    {
       return service.saveProduct(product);
    }

    // Post method
    @PostMapping("/add-products")
    public List<Product> addProducts(@RequestBody List<Product> products)
    {
        return service.saveProducts(products);
    }

    // Get method
    @GetMapping("/products")
    public List<Product> findAllProducts()
    {
        return service.getProducts();
    }

    // Get method
    @GetMapping("/product-by-id/{id}")
    public Product findProductById(@PathVariable int id)
    {
        return service.getProductById(id);
    }

    // Get method
    @GetMapping("/product-by-name/{name}")
    public Product findProductByName(@PathVariable String name)
    {
        return service.getProductByName(name);
    }

    // Update method
    @PutMapping("/update")
    public Product updateProduct(@RequestBody Product product)
    {
        return service.updateProduct(product);
    }

    // Delete method
    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id)
    {
        return service.deleteProduct(id);
    }

}
