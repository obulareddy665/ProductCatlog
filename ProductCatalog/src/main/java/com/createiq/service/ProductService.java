package com.createiq.service;

import java.util.List;

import com.createiq.bean.Product;

public interface ProductService {
	public void save(Product product) ;
	public void update(Product product);
	public List<Product> findAll();
	public Product findById(Integer id);
	public void delete_by_id(Integer id);

}
