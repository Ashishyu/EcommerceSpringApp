package com.example.EcommerceSpringApp.Gateway.API;

import com.example.EcommerceSpringApp.DTO.ResponseDTO.FakeStoreCategoryResponseDTO;
import com.example.EcommerceSpringApp.DTO.ResponseDTO.ProductResponseDTO;
import retrofit2.Call;
import retrofit2.http.GET;

public interface IFakeStoreCategoryAPI {
    @GET("products/category")
    Call<FakeStoreCategoryResponseDTO> getAllCategories();

}
