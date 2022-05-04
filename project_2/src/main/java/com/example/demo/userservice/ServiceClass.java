package com.example.demo.userservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Repository;
import com.example.demo.model.Food;

@Service
public class ServiceClass {
	
	@Autowired
	Repository re;
	
	public void add(Food food) {
		re.save(food);
	}
	
	public List<Food> getAll(){
		 List<Food> li= (List<Food>) re.findAll();
		 return li;
	}
	
	public Food update(int id) {
		Optional<Food> f=re.findById(id);
		Food fd=f.get();
		return fd;
	}
	public void del(int id) {
		re.deleteById(id);
	}

}
