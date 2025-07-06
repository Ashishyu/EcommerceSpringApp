package com.example.EcommerceSpringApp.DTO.ResponseDTO;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FakeStoreCategoryResponseDTO {
    String status;
    String message;
    List<String> categories;
}
