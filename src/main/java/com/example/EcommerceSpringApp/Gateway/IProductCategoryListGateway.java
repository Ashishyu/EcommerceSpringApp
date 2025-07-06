package com.example.EcommerceSpringApp.Gateway;

import com.example.EcommerceSpringApp.DTO.ResponseDTO.FakeStoreProductCategoryListResponseDTO;

import java.io.IOException;

public interface IProductCategoryListGateway {
    FakeStoreProductCategoryListResponseDTO getProductCategoryList(String type) throws IOException;
}
