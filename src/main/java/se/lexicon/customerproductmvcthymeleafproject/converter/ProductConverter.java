package se.lexicon.customerproductmvcthymeleafproject.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import se.lexicon.customerproductmvcthymeleafproject.model.dto.CategoryView;
import se.lexicon.customerproductmvcthymeleafproject.model.dto.ProductView;
import se.lexicon.customerproductmvcthymeleafproject.model.entity.Product;


import java.util.Collection;
import java.util.stream.Collectors;

@Component
public class ProductConverter implements Converter<Product, ProductView> {

    CategoryConverter categoryConverter;

    @Autowired
    public ProductConverter(CategoryConverter categoryConverter) {
        this.categoryConverter = categoryConverter;
    }


    @Override
    public Product toView(ProductView entity) {
        return null;
    }

    @Override
    public ProductView toEntity(Product view) {
        return null;
    }

    @Override
    public Collection<Product> toViews(Collection<ProductView> entities) {
        return null;
    }

    @Override
    public Collection<ProductView> toEntities(Collection<Product> views) {
        return null;
    }
}
