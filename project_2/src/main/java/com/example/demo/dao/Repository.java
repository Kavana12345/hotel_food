package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Food;

public interface Repository extends CrudRepository<Food, Integer>{

}
