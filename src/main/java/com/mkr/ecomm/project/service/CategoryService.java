package com.mkr.ecomm.project.service;

import com.mkr.ecomm.project.dto.CategoryDTO;
import com.mkr.ecomm.project.dto.CategoryResponse;
import com.mkr.ecomm.project.model.Category;

public interface CategoryService {

    CategoryResponse getAllCategories(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder);
    CategoryDTO addCategory(CategoryDTO categoryDTO);
    CategoryDTO deleteCategory(Long categoryId);

    CategoryDTO updateCategory(CategoryDTO categoryDTO, Long categoryId);
}
