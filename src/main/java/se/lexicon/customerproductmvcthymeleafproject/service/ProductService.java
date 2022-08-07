package se.lexicon.customerproductmvcthymeleafproject.service;

import se.lexicon.customerproductmvcthymeleafproject.model.dto.ProductView;

import java.util.List;

public interface ProductService {

    List<ProductView> findAll();
}
