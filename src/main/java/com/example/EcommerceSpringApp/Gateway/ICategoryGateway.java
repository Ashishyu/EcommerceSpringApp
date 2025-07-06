package com.example.EcommerceSpringApp.Gateway;

import com.example.EcommerceSpringApp.DTO.CategoryDTO;

import java.io.IOException;
import java.util.List;

public interface ICategoryGateway {
    List<CategoryDTO> getAllCategories() throws IOException;
}
