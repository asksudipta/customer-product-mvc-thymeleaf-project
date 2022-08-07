package se.lexicon.customerproductmvcthymeleafproject.repository;

import org.springframework.data.repository.CrudRepository;
import se.lexicon.customerproductmvcthymeleafproject.model.entity.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Integer> {


    Optional<Category> findByName(String name);

    List<Category> findAll();
    }
