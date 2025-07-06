package com.example.EcommerceSpringApp.DTO.RequestDTO;

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
public class FakeStoreUpdateProductRequestDTO {
    private String model;
    private String color;
    private int discount;
}