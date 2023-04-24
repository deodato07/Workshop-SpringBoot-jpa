package com.projetoweb.ProjetoSpring.repositories;

import com.projetoweb.ProjetoSpring.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
