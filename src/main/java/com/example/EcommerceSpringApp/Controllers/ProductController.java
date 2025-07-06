package com.example.EcommerceSpringApp.Controllers;

import com.example.EcommerceSpringApp.DTO.RequestDTO.FakeStoreUpdateProductRequestDTO;
import com.example.EcommerceSpringApp.DTO.ResponseDTO.ProductResponseDTO;
import com.example.EcommerceSpringApp.DTO.UpdatedProductData;
import com.example.EcommerceSpringApp.Services.IProductService;
import org.springframework.web.bind.annotation.*;
import retrofit2.http.Path;

import java.io.IOException;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    private final IProductService productService;

    public ProductController(IProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/{id}")
    public ProductResponseDTO getFakeProduct(@PathVariable Long id) throws IOException {
        return this.productService.getFakeProduct(id);
    }

    @PutMapping("/{id}")
    public UpdatedProductData getUpdatedProductData(@PathVariable Long id,
                                                    @RequestBody FakeStoreUpdateProductRequestDTO requestDTO) throws IOException {
        return this.productService.getUpdatedProductData(id, requestDTO).getProduct();
    }

}
