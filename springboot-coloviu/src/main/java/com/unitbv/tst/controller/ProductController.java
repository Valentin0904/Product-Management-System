package com.unitbv.tst.controller;


import com.unitbv.tst.entity.Order;
import com.unitbv.tst.entity.Product;
import com.unitbv.tst.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }


    @GetMapping
    public List<Product> getAllProducts(){
        return productService.getAllOrders();
    }

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable("id") Integer id){
        return productService.getProduct(id);
    }

    @PostMapping
    public Product saveProduct(@RequestBody Product product){
        return productService.saveProduct(product);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable("id") Integer id){
        productService.deleteProduct(id);
    }

    @GetMapping("/findByName")
    public List<Product> findByNameOrderBylastUpdate(@RequestParam String Name){
        return productService.findByNameOrderByLastUpdate(Name);
    }



}
