package com.example.EcommerceSpringApp.Gateway.API;

import com.example.EcommerceSpringApp.DTO.RequestDTO.FakeStoreUpdateProductRequestDTO;
import com.example.EcommerceSpringApp.DTO.ResponseDTO.FakeStoreUpdateProductResponseDTO;
import com.example.EcommerceSpringApp.DTO.ResponseDTO.ProductResponseDTO;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import retrofit2.http.Path;

import java.io.IOException;

public interface IFakeStoreProductAPI {
    @GET("products/{id}")
    Call<ProductResponseDTO> getFakeProduct(@Path("id") Long id) throws IOException;

    @PUT("products/{id}")
    Call<FakeStoreUpdateProductResponseDTO> getUpdatedProductData(@Path("id") Long id,
                                                                  @Body FakeStoreUpdateProductRequestDTO requestDTO) throws IOException;
}
