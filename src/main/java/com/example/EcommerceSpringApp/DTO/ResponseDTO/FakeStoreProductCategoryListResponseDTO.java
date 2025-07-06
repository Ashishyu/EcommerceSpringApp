package com.example.EcommerceSpringApp.DTO.ResponseDTO;

import com.example.EcommerceSpringApp.DTO.Product;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FakeStoreProductCategoryListResponseDTO {
    private String status;
    private String message;
    private List<Product> products;
}
