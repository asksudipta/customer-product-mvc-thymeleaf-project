package se.lexicon.customerproductmvcthymeleafproject.converter;

import se.lexicon.customerproductmvcthymeleafproject.model.dto.ProductView;
import se.lexicon.customerproductmvcthymeleafproject.model.entity.Product;

import java.util.Collection;

public interface Converter<V ,E> {

    V toView(E entity);

    E toEntity(V view);

    Collection<V> toViews(Collection<E> entities);

    Collection<E> toEntities(Collection<V> views);

}
