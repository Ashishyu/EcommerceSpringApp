package com.example.EcommerceSpringApp.Controllers;


import com.example.EcommerceSpringApp.DTO.CategoryDTO;
import com.example.EcommerceSpringApp.Services.ICategoryService;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    private final ICategoryService categoryService;
    //private final IProductService  productService;

    public CategoryController(ICategoryService _category) {
        this.categoryService = _category;
        //this.productService = productService;
    }

    @GetMapping
    public List<CategoryDTO> getAllCategories() throws IOException {
            return this.categoryService.getAllCategories();
    }

//    @GetMapping
//    public ProductResponseDTO getSingleProduct() {
//        return null;
//    }

}
