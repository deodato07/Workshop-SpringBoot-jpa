package com.projetoweb.ProjetoSpring.repositories;

import com.projetoweb.ProjetoSpring.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}

