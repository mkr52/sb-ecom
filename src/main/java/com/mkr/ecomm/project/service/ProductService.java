package com.mkr.ecomm.project.service;

import com.mkr.ecomm.project.dto.ProductDTO;
import com.mkr.ecomm.project.dto.ProductResponse;
import com.mkr.ecomm.project.model.Product;

public interface ProductService {
    ProductDTO addProduct(Long categoryId, ProductDTO product);

    ProductResponse getAllProducts();

    ProductResponse searchByCategory(Long categoryId);

    ProductResponse searchProductByKeyword(String keyword);

    ProductDTO updateProduct(Long productId, ProductDTO product);

    ProductDTO deleteProduct(Long productId);
}
