package com.createiq.service;

import java.util.List;

import com.createiq.bean.Product;
import com.createiq.dao.ProductDao;
import com.createiq.dao.ProductDaoImpl;

public class ProductServiceImpl implements ProductService {
	ProductDao pd=new ProductDaoImpl();
	@Override
	public void save(Product product) {
		pd.save(product);
		
	}

	@Override
	public void update(Product product) {
		pd.update(product);
		
	}

	@Override
	public List<Product> findAll() {
		List<Product> product=pd.findAll();
		return product;
	}

	@Override
	public List<Product> findById(Integer id) {
		List<Product> product=pd.findById(id);
		return product;
	
	}

	@Override
	public void delete_by_id(Integer id) {
		pd.delete_by_id(id);
		
	}

}
