package com.example.EcommerceSpringApp.Gateway;

import com.example.EcommerceSpringApp.DTO.RequestDTO.FakeStoreUpdateProductRequestDTO;
import com.example.EcommerceSpringApp.DTO.ResponseDTO.FakeStoreUpdateProductResponseDTO;
import com.example.EcommerceSpringApp.DTO.ResponseDTO.ProductResponseDTO;
import com.example.EcommerceSpringApp.Gateway.API.IFakeStoreProductAPI;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class FakeStoreProductGateway implements IProductGateway{

    private final IFakeStoreProductAPI fakeStoreProductAPI;

    public FakeStoreProductGateway(IFakeStoreProductAPI fakeStoreProductAPI) {
        this.fakeStoreProductAPI = fakeStoreProductAPI;
    }

    @Override
    public ProductResponseDTO getFakeProduct(Long id) throws IOException {

        System.out.println(id);

        ProductResponseDTO response = this.fakeStoreProductAPI
                .getFakeProduct(id)
                .execute()
                .body();

        if (response == null)
            throw new IOException("Failed to fetch fake product from FakeStoreAPI");

        return response;

    }

    @Override
    public FakeStoreUpdateProductResponseDTO getUpdatedProductData(Long id, FakeStoreUpdateProductRequestDTO requestDTO) throws IOException {

        FakeStoreUpdateProductResponseDTO response = this.fakeStoreProductAPI
                .getUpdatedProductData(id, requestDTO)
                .execute()
                .body();

        if (response == null)
            throw new IOException("Failed to fetch updated product data from FakeStoreAPI");

        return response;
    }
}
