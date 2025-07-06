package com.example.EcommerceSpringApp.DTO.ResponseDTO;

import com.example.EcommerceSpringApp.DTO.Product;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductResponseDTO {
    private Product product;
    private String message;
    private String status;
}
