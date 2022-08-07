package se.lexicon.customerproductmvcthymeleafproject.model.dto;

import lombok.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class ProductForm {


    @NotEmpty(message = "Product Name should not Empty")
    @Size(min = 2,max = 50,message = " Name length should be in between 2-50 Character")
    public String productName;

}
