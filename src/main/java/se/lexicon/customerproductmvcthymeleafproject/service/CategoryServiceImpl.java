package se.lexicon.customerproductmvcthymeleafproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.lexicon.customerproductmvcthymeleafproject.converter.CategoryConverter;
import se.lexicon.customerproductmvcthymeleafproject.model.dto.CategoryForm;
import se.lexicon.customerproductmvcthymeleafproject.model.dto.CategoryView;
import se.lexicon.customerproductmvcthymeleafproject.model.entity.Category;
import se.lexicon.customerproductmvcthymeleafproject.repository.CategoryRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService{

    CategoryRepository repository;
    CategoryConverter converter;

    @Autowired
    public CategoryServiceImpl(CategoryRepository repository, CategoryConverter converter) {
        this.repository = repository;
        this.converter = converter;
    }
    //ToDo: Implement methods..a

    @Override
    public CategoryView findById(int id) {
        return null;
    }


    @Override
    public CategoryView create(CategoryForm form) {

        return null;
    }

    @Override
    public List<CategoryView> findAll() {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public int categoriesSize() {
        return 0;
    }
}
