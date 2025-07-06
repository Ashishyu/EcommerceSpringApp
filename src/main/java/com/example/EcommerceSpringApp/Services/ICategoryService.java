package com.example.EcommerceSpringApp.Services;

import com.example.EcommerceSpringApp.DTO.CategoryDTO;

import java.io.IOException;
import java.util.List;

public interface ICategoryService {
    public List<CategoryDTO> getAllCategories() throws IOException;
}
