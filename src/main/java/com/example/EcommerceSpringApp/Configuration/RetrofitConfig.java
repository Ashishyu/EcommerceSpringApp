package com.example.EcommerceSpringApp.Configuration;

import com.example.EcommerceSpringApp.Gateway.API.IFakeStoreCategoryAPI;
import com.example.EcommerceSpringApp.Gateway.API.IFakeStoreProductAPI;
import com.example.EcommerceSpringApp.Gateway.API.IFakeStoreProductCategoryListAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Configuration
public class RetrofitConfig {

    @Bean
    public Retrofit retrofit() {
        return new Retrofit.Builder()
                .baseUrl("https://fakestoreapi.in/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    @Bean
    public IFakeStoreCategoryAPI fakeStoreCategoryAPI(Retrofit retrofit) {
        return retrofit.create(IFakeStoreCategoryAPI.class);
    }

    @Bean
    public IFakeStoreProductAPI fakeStoreProductAPI(Retrofit retrofit) {
        return retrofit.create(IFakeStoreProductAPI.class);
    }

    @Bean
    public IFakeStoreProductCategoryListAPI fakeStoreProductCategoryListAPI(Retrofit retrofit) {
        return retrofit.create(IFakeStoreProductCategoryListAPI.class);
    }

}
