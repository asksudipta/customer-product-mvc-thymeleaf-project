package se.lexicon.customerproductmvcthymeleafproject.model.dto;

import lombok.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class CategoryForm {

    @NotEmpty(message = "Category should be filled")
    @Size(min= 4, max=50, message = "Category name Length should be between 4-50 Character")
    public String name;

}
