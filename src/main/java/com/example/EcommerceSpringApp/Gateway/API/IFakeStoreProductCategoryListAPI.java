package com.example.EcommerceSpringApp.Gateway.API;

import com.example.EcommerceSpringApp.DTO.ResponseDTO.FakeStoreProductCategoryListResponseDTO;
import com.example.EcommerceSpringApp.Services.FakeStoreProductCategoryListService;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.io.IOException;

public interface IFakeStoreProductCategoryListAPI {
    @GET("products/category")
    Call<FakeStoreProductCategoryListResponseDTO> getProductCategoryList(@Query("type") String type) throws IOException;;
}
