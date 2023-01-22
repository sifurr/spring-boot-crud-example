package com.saifur.springboot.crud.example.service;

import com.saifur.springboot.crud.example.entity.Product;
import com.saifur.springboot.crud.example.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService
{
    @Autowired
    ProductRepository repository;

//  Post method to save in the database
    public Product saveProduct(Product product)
    {
        return repository.save(product);
    }
//  Post method to save in the database
    public List<Product> saveProducts(List<Product> products)
    {
        return repository.saveAll(products);
    }
//  Get method to retrieve from the database
    public List<Product> getProducts()
    {
        return repository.findAll();
    }
    //  Get method to retrieve from the database
    public Product getProductById(int id)
    {
        return repository.findById(id).orElse(null);
    }

//  Get method to retrieve from the database
    public Product getProductByName(String name)
    {
        return repository.findByName(name);
    }

//  Delete method to remove the product from the database
    public String deleteProduct(int id)
    {
        repository.deleteById(id);
        return "Product removed, id: " + id;
    }

/*  Update method to update the product in the database
    Note: id filed is read only data as it is a primary key*/
    public Product updateProduct(Product product)
    {
        // first retrieve the product from the database
        Product existingProduct = repository.findById(product.getId()).orElse(null);
        // set the update filed
        existingProduct.setName(product.getName());
        existingProduct.setQuantity(product.getQuantity());
        existingProduct.setPrice(product.getPrice());
        return repository.save(existingProduct);

    }


}
