package com.example.EcommerceSpringApp.Gateway;
import com.example.EcommerceSpringApp.DTO.ResponseDTO.FakeStoreProductCategoryListResponseDTO;
import com.example.EcommerceSpringApp.Gateway.API.IFakeStoreProductCategoryListAPI;
import org.springframework.stereotype.Component;
import java.io.IOException;

@Component
public class FakeStoreProductCategoryListGateway implements IProductCategoryListGateway {

    private final IFakeStoreProductCategoryListAPI fakeStoreProductCategoryListAPI;

    public FakeStoreProductCategoryListGateway(IFakeStoreProductCategoryListAPI fakeStoreProductCategoryListAPI) {
        this.fakeStoreProductCategoryListAPI = fakeStoreProductCategoryListAPI;
    }

    @Override
    public FakeStoreProductCategoryListResponseDTO getProductCategoryList(String type) throws IOException {
        FakeStoreProductCategoryListResponseDTO response = this.fakeStoreProductCategoryListAPI
                .getProductCategoryList(type)
                .execute()
                .body();

        if (response == null)
            throw new IOException("Failed to fetch product category list");

        return response;

    }
}
