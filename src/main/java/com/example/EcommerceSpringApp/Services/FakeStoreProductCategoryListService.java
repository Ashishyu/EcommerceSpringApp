package com.example.EcommerceSpringApp.Services;

import com.example.EcommerceSpringApp.DTO.ResponseDTO.FakeStoreProductCategoryListResponseDTO;
import com.example.EcommerceSpringApp.Gateway.IProductCategoryListGateway;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class FakeStoreProductCategoryListService implements IProductCategoryListService{

    private final IProductCategoryListGateway productCategoryListGateway;

    public FakeStoreProductCategoryListService(IProductCategoryListGateway productCategoryListGateway) {
        this.productCategoryListGateway = productCategoryListGateway;
    }

    @Override
    public FakeStoreProductCategoryListResponseDTO getProductCategoryList(String type) throws IOException {
        return this.productCategoryListGateway.getProductCategoryList(type);
    }

}
