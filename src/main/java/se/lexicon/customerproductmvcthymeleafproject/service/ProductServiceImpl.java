package se.lexicon.customerproductmvcthymeleafproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.lexicon.customerproductmvcthymeleafproject.converter.ProductConverter;
import se.lexicon.customerproductmvcthymeleafproject.model.dto.ProductView;
import se.lexicon.customerproductmvcthymeleafproject.model.entity.Product;
import se.lexicon.customerproductmvcthymeleafproject.repository.ProductRepository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    /* Dependency Injection*/
    ProductRepository productRepository;
    ProductConverter productConverter;


    @Autowired
    public ProductServiceImpl(ProductRepository productRepository, ProductConverter productConverter) {
        this.productRepository = productRepository;
        this.productConverter=productConverter;

    }
//TODO implement method
    public List<ProductView> findAll() {
    return null;
    }
}
