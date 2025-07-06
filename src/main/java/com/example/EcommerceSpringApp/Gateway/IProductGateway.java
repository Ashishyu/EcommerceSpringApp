package com.example.EcommerceSpringApp.Gateway;

import com.example.EcommerceSpringApp.DTO.RequestDTO.FakeStoreUpdateProductRequestDTO;
import com.example.EcommerceSpringApp.DTO.ResponseDTO.FakeStoreUpdateProductResponseDTO;
import com.example.EcommerceSpringApp.DTO.ResponseDTO.ProductResponseDTO;

import java.io.IOException;

public interface IProductGateway {
    ProductResponseDTO getFakeProduct(Long id) throws IOException;

    FakeStoreUpdateProductResponseDTO getUpdatedProductData(Long id,
                                                            FakeStoreUpdateProductRequestDTO requestDTO) throws IOException;
}