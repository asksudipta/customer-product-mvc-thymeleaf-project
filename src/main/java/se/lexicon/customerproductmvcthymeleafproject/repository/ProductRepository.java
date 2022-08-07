package se.lexicon.customerproductmvcthymeleafproject.repository;

import org.springframework.data.repository.CrudRepository;
import se.lexicon.customerproductmvcthymeleafproject.model.entity.Product;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Integer> {


    List<Product> findAll();

    List<Product> findAllByName(String name);

}
