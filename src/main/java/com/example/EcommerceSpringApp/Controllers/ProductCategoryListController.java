package com.example.EcommerceSpringApp.Controllers;

import com.example.EcommerceSpringApp.DTO.ResponseDTO.FakeStoreProductCategoryListResponseDTO;
import com.example.EcommerceSpringApp.Services.IProductCategoryListService;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/api/products")
public class ProductCategoryListController {

    private final IProductCategoryListService productCategoryListService;

    public ProductCategoryListController(IProductCategoryListService productCategoryListService) {
        this.productCategoryListService = productCategoryListService;
    }

    @GetMapping("/category")
    public FakeStoreProductCategoryListResponseDTO getProductList(@RequestParam String type) throws IOException {
        return this.productCategoryListService.getProductCategoryList(type);
    }
}
