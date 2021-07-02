package com.createiq.dao;

import java.util.List;

import com.createiq.bean.Product;

public interface ProductDao {
public void save(Product product) ;
public void update(Product product);
public List<Product> findAll();
public List<Product> findById(Integer id);
public void delete_by_id(Integer id);
}
