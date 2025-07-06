package com.example.EcommerceSpringApp.Services;

import com.example.EcommerceSpringApp.DTO.RequestDTO.FakeStoreUpdateProductRequestDTO;
import com.example.EcommerceSpringApp.DTO.ResponseDTO.FakeStoreUpdateProductResponseDTO;
import com.example.EcommerceSpringApp.DTO.ResponseDTO.ProductResponseDTO;
import com.example.EcommerceSpringApp.Gateway.IProductGateway;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class FakeStoreProductService implements IProductService {

    private final IProductGateway productGateway;

    public FakeStoreProductService(IProductGateway productGateway) {
        this.productGateway = productGateway;
    }

    @Override
    public ProductResponseDTO getFakeProduct(Long id) throws IOException {
        return this.productGateway.getFakeProduct(id);
    }

    @Override
    public FakeStoreUpdateProductResponseDTO getUpdatedProductData(Long id,
                                                                   FakeStoreUpdateProductRequestDTO requestDTO) throws IOException {
        return this.productGateway.getUpdatedProductData(id, requestDTO);
    }

}
