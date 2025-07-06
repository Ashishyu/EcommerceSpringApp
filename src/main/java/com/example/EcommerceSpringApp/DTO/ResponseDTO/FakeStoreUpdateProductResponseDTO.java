package com.example.EcommerceSpringApp.DTO.ResponseDTO;

import com.example.EcommerceSpringApp.DTO.UpdatedProductData;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class FakeStoreUpdateProductResponseDTO {
    private String status;
    private String message;
    private UpdatedProductData product;
}