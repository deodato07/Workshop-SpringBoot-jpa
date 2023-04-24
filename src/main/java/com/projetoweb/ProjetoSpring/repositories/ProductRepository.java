package com.projetoweb.ProjetoSpring.repositories;

import com.projetoweb.ProjetoSpring.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
