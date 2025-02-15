package com.BackendEcommerce.repositories;

import com.BackendEcommerce.Entities.Category;
import com.BackendEcommerce.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CategoryRepository extends JpaRepository<Category, UUID> {
}
