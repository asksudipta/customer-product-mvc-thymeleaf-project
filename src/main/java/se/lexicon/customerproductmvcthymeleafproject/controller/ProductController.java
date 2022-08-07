package se.lexicon.customerproductmvcthymeleafproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import se.lexicon.customerproductmvcthymeleafproject.model.dto.ProductView;
import se.lexicon.customerproductmvcthymeleafproject.service.ProductService;

import java.util.List;

@Controller
@RequestMapping("/Product")
public class ProductController
{

    ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    // http://localhost:8080/product/list
    @GetMapping("/list")
    public String showAllProductList(Model model){
        System.out.println("showAllProductList method has been executed!");
        List<ProductView> productViews = productService.findAll();
        model.addAttribute("productViews", productViews);
        return "product/products-view";
    }


    // http://localhost:8080/product/form
    @GetMapping("/form")
    public String displayProductForm(){
        System.out.println("displayProductForm method has been executed!");
        return "product/product-form";
    }

}
