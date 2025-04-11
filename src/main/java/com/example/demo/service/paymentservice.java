package com.example.demo.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Product;

public interface paymentservice extends JpaRepository<Product, Integer> {

}
