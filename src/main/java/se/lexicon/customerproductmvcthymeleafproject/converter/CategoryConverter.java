package se.lexicon.customerproductmvcthymeleafproject.converter;

import org.springframework.stereotype.Component;
import se.lexicon.customerproductmvcthymeleafproject.model.dto.CategoryView;
import se.lexicon.customerproductmvcthymeleafproject.model.entity.Category;

import java.util.Collection;
import java.util.stream.Collectors;

@Component
public class CategoryConverter implements Converter<Category, CategoryView>{


    @Override
    public Category toView(CategoryView entity) {

        new CategoryView(entity.getId(), entity.getName(), entity.getCreateDate());
        return null;
    }

    @Override
    public CategoryView toEntity(Category view) {
        new Category(view.getId(), view.getName(), view.getCreateDate());
        return null;
    }

    @Override
    public Collection<Category> toViews(Collection<CategoryView> entities) {
        entities.stream().map(this::toView).collect(Collectors.toList());
        return null;
    }

    @Override
    public Collection<CategoryView> toEntities(Collection<Category> views) {
        return views.stream().map(this::toEntity).collect(Collectors.toList());

    }


}
