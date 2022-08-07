package se.lexicon.customerproductmvcthymeleafproject.model.dto;

import lombok.*;

import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class CategoryView {
    private int id;
    private String name;
    private LocalDate createDate;

}
