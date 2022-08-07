package se.lexicon.customerproductmvcthymeleafproject.service;

import se.lexicon.customerproductmvcthymeleafproject.model.dto.CategoryForm;
import se.lexicon.customerproductmvcthymeleafproject.model.dto.CategoryView;

import java.util.List;

public interface CategoryService {

    CategoryView findById(int id);

    CategoryView create(CategoryForm form);

    List<CategoryView> findAll();

    boolean delete(int id);

    int categoriesSize();
}
