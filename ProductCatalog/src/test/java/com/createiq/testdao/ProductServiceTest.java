package com.createiq.testdao;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import com.createiq.bean.Product;
import com.createiq.service.ProductServiceImpl;

public class ProductServiceTest {
	ProductServiceImpl psi=new ProductServiceImpl();
	@Test
	@Ignore

	public void save() {
		
		Product product=new Product(1,"Tv",10000);
		psi.save(product);
		assertEquals(1,product.getpId());
		
		
	}
	@Test
	@Ignore
	
	public void update() {
		Product product=new Product(1,"Tv",10000);
		psi.update(product);
		assertEquals("Tv",product.getpName());
	}
	@Test
	@Ignore
	public void delete() {
		Product product=new Product();
		psi.delete_by_id(1);
	}
	@Test
	
	public void find_by_id() {
	//List<Product> product= psi.findById(1);
	


	Product products=new Product(1,"Tv",10000.0);
	List<Product> productss=new ArrayList<>();
	productss.add(products);
//	assertEquals(product, productss);
	
	
	
	
	   
	
	}
}
