package com.example.primeraweb;

import com.example.primeraweb.controller.ProductController;
import com.example.primeraweb.model.Product;
import com.example.primeraweb.repository.ProductRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class PrimeraWebApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(PrimeraWebApplication.class, args);
        var repository = context.getBean(ProductRepository.class);
        List<Product> products = null;
        for (int i = 0; i >= 10; i++) {
            products.add(new Product(null, "Producto"+(i+1), (5.99+10), 1+i));
        }
        repository.saveAll(products);
    }

}
