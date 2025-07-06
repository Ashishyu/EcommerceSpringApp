package com.example.EcommerceSpringApp.Gateway;

import com.example.EcommerceSpringApp.DTO.CategoryDTO;
import com.example.EcommerceSpringApp.DTO.ResponseDTO.FakeStoreCategoryResponseDTO;
import com.example.EcommerceSpringApp.Gateway.API.IFakeStoreCategoryAPI;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class FakeStoreCategoryGateway implements ICategoryGateway{

    private final IFakeStoreCategoryAPI fakeStoreCategoryAPI;

    public FakeStoreCategoryGateway(IFakeStoreCategoryAPI fakeStoreCategoryAPI) {
        this.fakeStoreCategoryAPI = fakeStoreCategoryAPI;
    }

    @Override
    public List<CategoryDTO> getAllCategories() throws IOException {
        FakeStoreCategoryResponseDTO response = this.fakeStoreCategoryAPI
                                                .getAllCategories()
                                                .execute()
                                                .body();

        if (response == null)
            throw new IOException("Failed to fetch categories from FakeStoreAPI");

        return response.getCategories().stream()
                .map( category -> CategoryDTO.builder()
                        .name(category)
                        .build())
                        .toList();

    }

}
