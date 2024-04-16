package com.unitbv.tst.service;



import com.unitbv.tst.entity.Order;
import com.unitbv.tst.entity.Product;
import com.unitbv.tst.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllOrders(){
        return productRepository.findAll();
    }

    public Product getProduct(Integer id){
        return productRepository.findById(id).get();
    }

    public Product saveProduct(Product product){return productRepository.save(product);
    }

    public void deleteProduct(Integer id){
        productRepository.deleteById(id);
    }

    public List<Product> findByNameOrderByLastUpdate (String Name){
        return productRepository.findByNameOrderByLastUpdate(Name);
    }

}
