package com.example.EcommerceSpringApp.Services;

import com.example.EcommerceSpringApp.DTO.RequestDTO.FakeStoreUpdateProductRequestDTO;
import com.example.EcommerceSpringApp.DTO.ResponseDTO.FakeStoreUpdateProductResponseDTO;
import com.example.EcommerceSpringApp.DTO.ResponseDTO.ProductResponseDTO;

import java.io.IOException;

public interface IProductService {
    ProductResponseDTO getFakeProduct(Long id) throws IOException;
    FakeStoreUpdateProductResponseDTO getUpdatedProductData(Long id,
                                                            FakeStoreUpdateProductRequestDTO requestDTO) throws IOException;

}
