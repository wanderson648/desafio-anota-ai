package com.wo.desafioanotaai.domain.product;

import com.wo.desafioanotaai.domain.category.Category;

public record ProductDTO(String title, String description, String ownerId, Integer price, String categoryId) {
}
