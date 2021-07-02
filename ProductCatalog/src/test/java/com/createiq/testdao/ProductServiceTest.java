package com.createiq.testdao;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.createiq.bean.Product;
import com.createiq.service.ProductServiceImpl;

public class ProductServiceTest {
	@Test
	public void save() {
		ProductServiceImpl psi=new ProductServiceImpl();
		Product product=new Product(1, "sandeep", 10989);
		psi.save(product);
		assertEquals(1,product.getpId());
		
	}
}
