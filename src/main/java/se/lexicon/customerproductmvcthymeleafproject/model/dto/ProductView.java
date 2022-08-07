package se.lexicon.customerproductmvcthymeleafproject.model.dto;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class ProductView {

    private int id;
    private String name;
    private double price;
    private CategoryView categoryView;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDate date;

}

