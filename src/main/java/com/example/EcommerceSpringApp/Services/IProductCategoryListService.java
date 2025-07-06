package com.example.EcommerceSpringApp.Services;

import com.example.EcommerceSpringApp.DTO.ResponseDTO.FakeStoreProductCategoryListResponseDTO;
import retrofit2.Call;
import retrofit2.http.GET;

import java.io.IOException;

public interface IProductCategoryListService {

    FakeStoreProductCategoryListResponseDTO getProductCategoryList(String type) throws IOException;
}
